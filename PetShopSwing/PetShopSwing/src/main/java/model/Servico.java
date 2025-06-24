package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Servico {
    private String tipo;
    private double preco;
    private LocalDate data;
    private Pet pet;

    public Servico(String tipo, double preco, LocalDate data, Pet pet) {
        this.tipo = tipo;
        this.preco = preco;
        this.data = data;
        this.pet = pet;
    }

    public Servico(String servicoNome, String tipo, Cliente cliente, Pet pet, LocalDate data) {
        this.tipo = servicoNome;
        this.pet = pet;
        this.data = data;

        switch (servicoNome) {
            case "Banho e Tosa":
                this.preco = 100.0;
                break;
            case "Consulta Veterinária":
                this.preco = 150.0;
                break;
            case "Hospedagem":
                this.preco = 200.0;
                break;
            case "Adestramento":
                this.preco = 180.0;
                break;
            case "Pacote Básico (Banho + Consulta)":
                this.preco = 220.0;
                break;
            case "Pacote Premium (Banho + Consulta + Adestramento)":
                this.preco = 300.0;
                break;
            default:
                this.preco = 0.0;
                break;
        }
    }

    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }
    public LocalDate getData() { return data; }
    public Pet getPet() { return pet; }

    @Override
    public String toString() {
        return tipo + " - " + preco + " - " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " - Pet: " + pet.getNome();
    }
}
