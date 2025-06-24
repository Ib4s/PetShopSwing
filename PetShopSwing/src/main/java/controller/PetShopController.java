/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cliente;
import model.Pet;
import model.Servico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PetShopController {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Servico> servicos = new ArrayList<>();

    // Cliente
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    // Pet
    public void adicionarPetAoCliente(String nomeCliente, Pet pet) {
        Cliente cliente = buscarClientePorNome(nomeCliente);
        if (cliente != null) {
            cliente.adicionarPet(pet);
        }
    }

    public void removerPetDoCliente(String nomeCliente, Pet pet) {
        Cliente cliente = buscarClientePorNome(nomeCliente);
        if (cliente != null) {
            cliente.removerPet(pet);
        }
    }

    public List<Pet> getPetsDoCliente(String nomeCliente) {
        Cliente cliente = buscarClientePorNome(nomeCliente);
        return (cliente != null) ? cliente.getPets() : new ArrayList<>();
    }

    // Serviço
    public void contratarServico(Servico servico) {
        servicos.add(servico);
    }

    public void cancelarServico(Servico servico) {
        servicos.remove(servico);
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public List<Servico> buscarServicosPorPet(Pet pet) {
        return servicos.stream()
                .filter(s -> s.getPet().equals(pet))
                .collect(Collectors.toList());
    }

    public void adicionarServico(Servico servico) {
    servicos.add(servico);
}

public void removerServico(int index) {
    if (index >= 0 && index < servicos.size()) {
        servicos.remove(index);
    }
}

}
