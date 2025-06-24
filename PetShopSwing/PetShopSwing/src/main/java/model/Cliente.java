/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private List<Pet> pets;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public void removerPet(Pet pet) {
        pets.remove(pet);
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public List<Pet> getPets() { return pets; }

    @Override
    public String toString() {
        return nome + " - " + telefone + " - " + email;
    }
}
