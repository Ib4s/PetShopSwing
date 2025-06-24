/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.PetShopController;
import java.util.List;
import model.Cliente;
import model.Pet;
import model.Validacao;

public class PetFrame extends javax.swing.JFrame {
    private controller.PetShopController controller;
    private javax.swing.DefaultListModel<String> listaModel = new javax.swing.DefaultListModel<>();

    public PetFrame(PetShopController controller) {
        initComponents();
        this.controller = controller;
        listaPets.setModel(listaModel);
        carregarClientes();
    }
    
    private void carregarClientes() {
        cmbClientes.removeAllItems();
        for (Cliente c : controller.getClientes()) {
            cmbClientes.addItem(c.getNome());
        }
    }
    
    private void atualizarLista() {
        listaModel.clear();
        int index = cmbClientes.getSelectedIndex();
        if (index >= 0) {
            Cliente cliente = controller.getClientes().get(index);
            List<Pet> pets = cliente.getPets();
            for (Pet p : pets) {
                listaModel.addElement(p.toString());
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblNomePet = new javax.swing.JLabel();
        txtNomePet = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPets = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCliente.setText("Cliente");

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });

        lblNomePet.setText("Nome do Pet");

        lblEspecie.setText("Espécie");

        lblRaca.setText("Raça");

        lblIdade.setText("Idade (anos)");

        lblPeso.setText("Peso (kg)");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar Pet");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover Selecionado");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        listaPets.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEspecie)
                                    .addComponent(lblIdade)
                                    .addComponent(txtEspecie)
                                    .addComponent(txtIdade)
                                    .addComponent(cmbClientes, 0, 100, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNomePet)
                                    .addComponent(txtNomePet, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lblRaca)
                                    .addComponent(txtRaca)
                                    .addComponent(lblPeso)
                                    .addComponent(txtPeso)))
                            .addComponent(lblCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCliente)
                                    .addComponent(lblNomePet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaca)
                            .addComponent(lblEspecie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdade)
                            .addComponent(lblPeso))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int index = cmbClientes.getSelectedIndex();
    if (index < 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente.");
        return;
    }

    String nome = txtNomePet.getText().trim();
    String especie = txtEspecie.getText().trim();
    String raca = txtRaca.getText().trim();
    String idadeStr = txtIdade.getText().trim();
    String pesoStr = txtPeso.getText().trim();

    if (nome.isEmpty() || especie.isEmpty() || raca.isEmpty() || idadeStr.isEmpty() || pesoStr.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        return;
    }

    int idade;
    double peso;

    try {
        idade = Integer.parseInt(idadeStr);
        peso = Double.parseDouble(pesoStr);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Idade ou peso inválidos.");
        return;
    }

    if (!model.Validacao.validarIdadePeso(idade, peso)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Idade e peso devem ser maiores que zero.");
        return;
    }

    model.Cliente cliente = controller.getClientes().get(index);
    model.Pet pet = new model.Pet(nome, especie, raca, idade, peso);
    cliente.adicionarPet(pet);
    atualizarLista();

    txtNomePet.setText("");
    txtEspecie.setText("");
    txtRaca.setText("");
    txtIdade.setText("");
    txtPeso.setText("");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int clienteIndex = cmbClientes.getSelectedIndex();
        int petIndex = listaPets.getSelectedIndex();
    if (clienteIndex >= 0 && petIndex >= 0) {
        model.Cliente cliente = controller.getClientes().get(clienteIndex);
        cliente.getPets().remove(petIndex);
        atualizarLista();
    }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        atualizarLista();
    }//GEN-LAST:event_cmbClientesActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
        controller.PetShopController controller = new controller.PetShopController();
        new PetFrame(controller).setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNomePet;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JList<String> listaPets;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
