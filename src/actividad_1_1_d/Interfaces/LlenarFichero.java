package actividad_1_1_d.Interfaces;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LlenarFichero extends javax.swing.JFrame {

    String path;

    public LlenarFichero(String path) {
        initComponents();
        this.path = path;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textoParaElFicheroJTextArea = new javax.swing.JTextArea();
        crearDatosEnFicheroJButton = new javax.swing.JButton();
        salirDeLaCreacionDelFIcheroJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("[i] Introducir texto en el archivo:");

        textoParaElFicheroJTextArea.setColumns(20);
        textoParaElFicheroJTextArea.setRows(5);
        jScrollPane1.setViewportView(textoParaElFicheroJTextArea);

        crearDatosEnFicheroJButton.setText("CREAR");
        crearDatosEnFicheroJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDatosEnFicheroJButtonActionPerformed(evt);
            }
        });

        salirDeLaCreacionDelFIcheroJButton.setText("SALIR");
        salirDeLaCreacionDelFIcheroJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirDeLaCreacionDelFIcheroJButtonActionPerformed(evt);
            }
        });

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
                        .addGap(0, 263, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salirDeLaCreacionDelFIcheroJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearDatosEnFicheroJButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearDatosEnFicheroJButton)
                    .addComponent(salirDeLaCreacionDelFIcheroJButton))
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void salirDeLaCreacionDelFIcheroJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirDeLaCreacionDelFIcheroJButtonActionPerformed


        this.dispose();
        
    }//GEN-LAST:event_salirDeLaCreacionDelFIcheroJButtonActionPerformed

    private void crearDatosEnFicheroJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDatosEnFicheroJButtonActionPerformed

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(this.path))) {

            escritor.write(textoParaElFicheroJTextArea.getText());
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(new File(path));
        nuevaPantallaPrincipal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_crearDatosEnFicheroJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearDatosEnFicheroJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirDeLaCreacionDelFIcheroJButton;
    private javax.swing.JTextArea textoParaElFicheroJTextArea;
    // End of variables declaration//GEN-END:variables
}
