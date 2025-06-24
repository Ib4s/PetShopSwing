/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.PetShopController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pet;
import model.Servico;
import model.Validacao;
import model.PacoteServico;
import java.util.List;
import java.util.ArrayList;

public class PacoteFrame extends javax.swing.JFrame {
    private controller.PetShopController controller;
    private javax.swing.DefaultListModel<String> listaModel = new javax.swing.DefaultListModel<>();
    private java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public PacoteFrame(controller.PetShopController controller) {
        initComponents();
        this.controller = controller;
        listaPacotes.setModel(listaModel);
        carregarClientes();
        carregarPacotes();
    }

    private void carregarClientes() {
    cmbClientes.removeAllItems();
    for (model.Cliente c : controller.getClientes()) {
        cmbClientes.addItem(c.getNome());
    }
}
    
    private void carregarPets() {
    cmbPets.removeAllItems();
    int index = cmbClientes.getSelectedIndex();
    if (index >= 0) {
        model.Cliente cliente = controller.getClientes().get(index);
        for (model.Pet p : cliente.getPets()) {
            cmbPets.addItem(p.getNome());
        }
    }
}
    
    private void carregarPacotes() {
    cmbPacotes.removeAllItems();
    cmbPacotes.addItem("Pacote Básico (Banho + Consulta) - 10% OFF");
    cmbPacotes.addItem("Pacote Premium (Banho + Consulta + Adestramento) - 20% OFF");
}
    
    private void atualizarLista() {
    listaModel.clear();
    for (model.Servico s : controller.getServicos()) {
        if (s instanceof PacoteServico) {
            listaModel.addElement(s.toString());
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblPet = new javax.swing.JLabel();
        cmbPets = new javax.swing.JComboBox<>();
        lblPacote = new javax.swing.JLabel();
        cmbPacotes = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnContratar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPacotes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCliente.setText("Cliente:");

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });

        lblPet.setText("Pet:");

        cmbPets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPacote.setText("Pacote:");

        cmbPacotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblData.setText("Data (dd/mm/aaaa):");

        btnContratar.setText("Contratar Pacote");
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar Selecionado");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        listaPacotes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPacotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente)
                            .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPacote))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblPet))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cmbPets, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cmbPacotes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblPacote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnContratar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        carregarPets();
        atualizarLista();
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
     int clienteIndex = cmbClientes.getSelectedIndex();
    int petIndex = cmbPets.getSelectedIndex();
    if (clienteIndex < 0 || petIndex < 0) {
        JOptionPane.showMessageDialog(this, "Selecione cliente e pet.");
        return;
    }
    String pacoteNome = cmbPacotes.getSelectedItem().toString();
    String dataStr = txtData.getText().trim();
    if (dataStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Informe a data.");
        return;
    }
    LocalDate data;
    try {
        data = LocalDate.parse(dataStr, formatter);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Data inválida. Use dd/MM/yyyy.");
        return;
    }
    if (!Validacao.validarDataFutura(data)) {
        JOptionPane.showMessageDialog(this, "A data deve ser futura.");
        return;
    }
    Cliente cliente = controller.getClientes().get(clienteIndex);
    Pet pet = cliente.getPets().get(petIndex);

    List<Servico> servicosDoPacote = new ArrayList<>();
    double desconto = 0.0;
    if (pacoteNome.contains("Básico")) {
        servicosDoPacote.add(new Servico("Banho e Tosa", "Avulso", cliente, pet, data));
        servicosDoPacote.add(new Servico("Consulta Veterinária", "Avulso", cliente, pet, data));
        desconto = 0.10;
    } else if (pacoteNome.contains("Premium")) {
        servicosDoPacote.add(new Servico("Banho e Tosa", "Avulso", cliente, pet, data));
        servicosDoPacote.add(new Servico("Consulta Veterinária", "Avulso", cliente, pet, data));
        servicosDoPacote.add(new Servico("Adestramento", "Avulso", cliente, pet, data));
        desconto = 0.20;
    }

    PacoteServico pacote = new PacoteServico(servicosDoPacote, desconto, data, pet);
    controller.adicionarServico(pacote);
    atualizarLista();
    txtData.setText("");
    }//GEN-LAST:event_btnContratarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int index = listaPacotes.getSelectedIndex();
    if (index >= 0) {
        // Garante que remove o item da lista geral de serviços
        int realIndex = -1;
        int contador = 0;
        for (int i = 0; i < controller.getServicos().size(); i++) {
            if (controller.getServicos().get(i).getTipo().equals("Pacote")) {
                if (contador == index) {
                    realIndex = i;
                    break;
                }
                contador++;
            }
        }
        if (realIndex != -1) {
            controller.removerServico(realIndex);
            atualizarLista();
        }
    }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContratar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JComboBox<String> cmbPacotes;
    private javax.swing.JComboBox<String> cmbPets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPacote;
    private javax.swing.JLabel lblPet;
    private javax.swing.JList<String> listaPacotes;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
