package actividad_1_1_d.Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContarPalabras extends javax.swing.JFrame {

    File fichero;

    public ContarPalabras(File fichero) {
        initComponents();
        this.fichero = fichero;
        this.setLocationRelativeTo(null);

        rutaDelArchivoJTextField.setText(fichero.getAbsolutePath());

        try (BufferedReader lector = new BufferedReader(new FileReader(this.fichero))) {

            StringBuilder contenidoFichero = new StringBuilder();
            String linea;

            while ((linea = lector.readLine()) != null) {
                contenidoFichero.append(linea).append("\n");
            }
            letrasAContarJtextArea.setText(contenidoFichero.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rutaDelArchivoJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        letrasAContarJtextArea = new javax.swing.JTextArea();
        salirContarPalabrasJButton = new javax.swing.JButton();
        contarLetrasJButton = new javax.swing.JButton();
        conteoDeLetrasJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mostrar texto del archivo:");

        rutaDelArchivoJTextField.setEditable(false);
        rutaDelArchivoJTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        letrasAContarJtextArea.setEditable(false);
        letrasAContarJtextArea.setColumns(20);
        letrasAContarJtextArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        letrasAContarJtextArea.setRows(5);
        jScrollPane1.setViewportView(letrasAContarJtextArea);

        salirContarPalabrasJButton.setText("SALIR");
        salirContarPalabrasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirContarPalabrasJButtonActionPerformed(evt);
            }
        });

        contarLetrasJButton.setText("CONTAR");
        contarLetrasJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contarLetrasJButtonActionPerformed(evt);
            }
        });

        conteoDeLetrasJTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rutaDelArchivoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirContarPalabrasJButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contarLetrasJButton)
                        .addGap(18, 18, 18)
                        .addComponent(conteoDeLetrasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rutaDelArchivoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contarLetrasJButton)
                    .addComponent(conteoDeLetrasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(salirContarPalabrasJButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contarLetrasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contarLetrasJButtonActionPerformed

        try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
            String linea;
            int totalPalabras = 0;
            
            while ((linea = lector.readLine()) != null) {

                String [] palabras = linea.split("\\s+");
                totalPalabras += palabras.length;
            }
            conteoDeLetrasJTextField.setText(String.valueOf(totalPalabras));
            lector.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_contarLetrasJButtonActionPerformed

    private void salirContarPalabrasJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirContarPalabrasJButtonActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_salirContarPalabrasJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contarLetrasJButton;
    private javax.swing.JTextField conteoDeLetrasJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea letrasAContarJtextArea;
    private javax.swing.JTextField rutaDelArchivoJTextField;
    private javax.swing.JButton salirContarPalabrasJButton;
    // End of variables declaration//GEN-END:variables
}
