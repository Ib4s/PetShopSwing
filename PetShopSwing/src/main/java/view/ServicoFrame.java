package view;

import controller.PetShopController;
import model.Cliente;
import model.Pet;
import model.Servico;
import model.PacoteServico;
import model.Validacao;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ServicoFrame extends javax.swing.JFrame {
    private PetShopController controller;
    private DefaultListModel<String> listaModel = new DefaultListModel<>();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ServicoFrame(PetShopController controller) {
        initComponents();
        this.controller = controller;
        listaServicos.setModel(listaModel);
        carregarClientes();
        carregarTipos();

        cmbTipoServico.addItemListener(e -> {
            if (cmbTipoServico.getSelectedItem() != null) {
                carregarServicos();
            }
        });

        cmbClientes.addItemListener(e -> {
            if (cmbClientes.getSelectedItem() != null) {
                carregarPets();
                atualizarLista();
            }
        });
    }

    private void carregarClientes() {
        cmbClientes.removeAllItems();
        for (Cliente c : controller.getClientes()) {
            cmbClientes.addItem(c.getNome());
        }
    }

    private void carregarTipos() {
        cmbTipoServico.removeAllItems();
        cmbTipoServico.addItem("Avulso");
        cmbTipoServico.addItem("Pacote");
    }

    private void carregarPets() {
        cmbPets.removeAllItems();
        int index = cmbClientes.getSelectedIndex();
        if (index >= 0 && index < controller.getClientes().size()) {
            Cliente cliente = controller.getClientes().get(index);
            for (Pet p : cliente.getPets()) {
                cmbPets.addItem(p.getNome());
            }
        }
    }

    private void carregarServicos() {
        cmbServicos.removeAllItems();
        Object tipoSelecionado = cmbTipoServico.getSelectedItem();
        if (tipoSelecionado == null) return;

        if (tipoSelecionado.equals("Avulso")) {
            cmbServicos.addItem("Banho e Tosa");
            cmbServicos.addItem("Consulta Veterinária");
            cmbServicos.addItem("Hospedagem");
            cmbServicos.addItem("Adestramento");
        } else {
            cmbServicos.addItem("Pacote Básico (Banho + Consulta)");
            cmbServicos.addItem("Pacote Premium (Banho + Consulta + Adestramento)");
        }
    }

    private void atualizarLista() {
        listaModel.clear();
        for (Servico s : controller.getServicos()) {
           if (!(s instanceof PacoteServico)) { 
            listaModel.addElement(s.toString());
        }
     }
    }     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblPet = new javax.swing.JLabel();
        cmbPets = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblServico = new javax.swing.JLabel();
        cmbTipoServico = new javax.swing.JComboBox<>();
        cmbServicos = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaServicos = new javax.swing.JList<>();
        btnContratar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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

        lblTipo.setText("Tipo de Serviço:");

        lblServico.setText("Serviço:");

        cmbTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoServicoActionPerformed(evt);
            }
        });

        cmbServicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblData.setText("Data do Serviço:");

        txtData.setText("formato: dd/mm/aaaa");

        listaServicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaServicos);

        btnContratar.setText("Contratar Serviço");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipo)
                                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPet)
                                    .addComponent(lblServico)
                                    .addComponent(cmbPets, 0, 100, Short.MAX_VALUE)
                                    .addComponent(cmbServicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(lblPet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(lblServico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(btnContratar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        carregarPets();
        atualizarLista();
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void cmbTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoServicoActionPerformed
        carregarServicos();
    }//GEN-LAST:event_cmbTipoServicoActionPerformed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
int clienteIndex = cmbClientes.getSelectedIndex();
        int petIndex = cmbPets.getSelectedIndex();

        if (clienteIndex < 0 || petIndex < 0) {
            JOptionPane.showMessageDialog(this, "Selecione cliente e pet.");
            return;
        }

        String tipo = cmbTipoServico.getSelectedItem().toString();
        String servicoNome = cmbServicos.getSelectedItem().toString();
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

        Servico servico;
        if (servicoNome.startsWith("Pacote")) {
            List<Servico> servicosDoPacote = new java.util.ArrayList<>();
            if (servicoNome.contains("Básico")) {
                servicosDoPacote.add(new Servico("Banho e Tosa", "Avulso", cliente, pet, data));
                servicosDoPacote.add(new Servico("Consulta Veterinária", "Avulso", cliente, pet, data));
            } else {
                servicosDoPacote.add(new Servico("Banho e Tosa", "Avulso", cliente, pet, data));
                servicosDoPacote.add(new Servico("Consulta Veterinária", "Avulso", cliente, pet, data));
                servicosDoPacote.add(new Servico("Adestramento", "Avulso", cliente, pet, data));
            }
            double desconto = servicoNome.contains("Premium") ? 0.20 : 0.10;
            servico = new PacoteServico(servicosDoPacote, desconto, data, pet);
        } else {
            servico = new Servico(servicoNome, tipo, cliente, pet, data);
        }

        controller.adicionarServico(servico);
        atualizarLista();
        txtData.setText("");
    }//GEN-LAST:event_btnContratarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            int index = listaServicos.getSelectedIndex();
        if (index >= 0) {
            controller.removerServico(index);
            atualizarLista();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContratar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JComboBox<String> cmbPets;
    private javax.swing.JComboBox<String> cmbServicos;
    private javax.swing.JComboBox<String> cmbTipoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPet;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JList<String> listaServicos;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
