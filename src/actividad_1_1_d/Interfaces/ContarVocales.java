package actividad_1_1_d.Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ContarVocales extends javax.swing.JFrame {

    File fichero;
    
    public ContarVocales(File fichero) {
        initComponents();
        this.fichero = fichero;
        this.setLocationRelativeTo(null);
        
        rutaDelArchivoJTExtField.setText(fichero.getAbsolutePath());
        
         try (BufferedReader lector = new BufferedReader(new FileReader(this.fichero))) {
             
                StringBuilder contenidoFichero = new StringBuilder();
                String linea;

                while ((linea = lector.readLine()) != null) {
                    contenidoFichero.append(linea).append("\n");
                }
                textoFicheroJTextArea.setText(contenidoFichero.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rutaDelArchivoJTExtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoFicheroJTextArea = new javax.swing.JTextArea();
        contarVocalesJButton = new javax.swing.JButton();
        aContadorJTextField = new javax.swing.JTextField();
        eContadorJTextField = new javax.swing.JTextField();
        iContadorJTextField = new javax.swing.JTextField();
        oContadorJTextField = new javax.swing.JTextField();
        uCOntadorJTextField = new javax.swing.JTextField();
        salirContarVocalesJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mostrar texto del archivo:");

        rutaDelArchivoJTExtField.setEditable(false);
        rutaDelArchivoJTExtField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        textoFicheroJTextArea.setEditable(false);
        textoFicheroJTextArea.setColumns(20);
        textoFicheroJTextArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textoFicheroJTextArea.setRows(5);
        jScrollPane1.setViewportView(textoFicheroJTextArea);

        contarVocalesJButton.setText("CONTAR");
        contarVocalesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contarVocalesJButtonActionPerformed(evt);
            }
        });

        aContadorJTextField.setEditable(false);

        eContadorJTextField.setEditable(false);

        iContadorJTextField.setEditable(false);

        oContadorJTextField.setEditable(false);

        uCOntadorJTextField.setEditable(false);

        salirContarVocalesJButton.setText("SALIR");
        salirContarVocalesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirContarVocalesJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("A");

        jLabel3.setText("E");

        jLabel4.setText("I");

        jLabel5.setText("O");

        jLabel6.setText("U");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirContarVocalesJButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(contarVocalesJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uCOntadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaDelArchivoJTExtField)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rutaDelArchivoJTExtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oContadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uCOntadorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contarVocalesJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(salirContarVocalesJButton)
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

    private void contarVocalesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contarVocalesJButtonActionPerformed

            try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
                String line;
                Map<Character, Integer> vocalesContador = new HashMap<>();
                vocalesContador.put('a', 0);
                vocalesContador.put('e', 0);
                vocalesContador.put('i', 0);
                vocalesContador.put('o', 0);
                vocalesContador.put('u', 0);

                while ((line = lector.readLine()) != null) {
                    
                    for (char c : line.toLowerCase().toCharArray()) {
                        
                        if (vocalesContador.containsKey(c)) {
                            vocalesContador.put(c, vocalesContador.get(c) + 1);
                        }
                    }
                }
                
                aContadorJTextField.setText(String.valueOf(vocalesContador.get('a')));
                eContadorJTextField.setText(String.valueOf(vocalesContador.get('e')));
                iContadorJTextField.setText(String.valueOf(vocalesContador.get('i')));
                oContadorJTextField.setText(String.valueOf(vocalesContador.get('o')));
                uCOntadorJTextField.setText(String.valueOf(vocalesContador.get('u')));
                lector.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }     
    }//GEN-LAST:event_contarVocalesJButtonActionPerformed

    private void salirContarVocalesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirContarVocalesJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirContarVocalesJButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aContadorJTextField;
    private javax.swing.JButton contarVocalesJButton;
    private javax.swing.JTextField eContadorJTextField;
    private javax.swing.JTextField iContadorJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oContadorJTextField;
    private javax.swing.JTextField rutaDelArchivoJTExtField;
    private javax.swing.JButton salirContarVocalesJButton;
    private javax.swing.JTextArea textoFicheroJTextArea;
    private javax.swing.JTextField uCOntadorJTextField;
    // End of variables declaration//GEN-END:variables
}
