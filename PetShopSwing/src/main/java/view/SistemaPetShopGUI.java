/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;


public class SistemaPetShopGUI extends javax.swing.JFrame {
    private controller.PetShopController controller;

    public SistemaPetShopGUI() {
    throw new UnsupportedOperationException("Use o construtor SistemaPetShopGUI(PetShopController) ao iniciar o sistema.");
}


    // Construtor alternativo com injeção do controller
    public SistemaPetShopGUI(controller.PetShopController controller) {
        initComponents();
        this.controller = controller;
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JButton();
        btnPets = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        btnPacotes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClientes.setText("Gerenciar Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPets.setText("Gerenciar Pets");
        btnPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetsActionPerformed(evt);
            }
        });

        btnServicos.setText("Gerenciar Serviços");
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosActionPerformed(evt);
            }
        });

        btnPacotes.setText("Ver Pacotes Contratados");
        btnPacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacotesActionPerformed(evt);
            }
        });

        jLabel1.setText("BEM VINDO AO SISTEMA PETSHOP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPets, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(btnClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPets)
                .addGap(12, 12, 12)
                .addComponent(btnServicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPacotes)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        new ClienteFrame(controller).setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetsActionPerformed
        new PetFrame(controller).setVisible(true);
    }//GEN-LAST:event_btnPetsActionPerformed

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        new ServicoFrame(controller).setVisible(true);
    }//GEN-LAST:event_btnServicosActionPerformed

    private void btnPacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacotesActionPerformed
        new PacoteFrame(controller).setVisible(true);
    }//GEN-LAST:event_btnPacotesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        controller.PetShopController controller = new controller.PetShopController();
        new SistemaPetShopGUI(controller).setVisible(true); // usa o construtor que recebe
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPacotes;
    private javax.swing.JButton btnPets;
    private javax.swing.JButton btnServicos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
