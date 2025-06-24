/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.List;

public class PacoteServico extends Servico {
    private List<Servico> servicos;
    private double desconto;

    public PacoteServico(List<Servico> servicos, double desconto, LocalDate data, Pet pet) {
        super("Pacote", calcularPrecoComDesconto(servicos, desconto), data, pet);
        this.servicos = servicos;
        this.desconto = desconto;
    }

    private static double calcularPrecoComDesconto(List<Servico> servicos, double desconto) {
        double total = 0;
        for (Servico s : servicos) total += s.getPreco();
        return total * (1 - desconto);
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Pacote de Serviços (Desconto: ").append((desconto * 100)).append("%)").append("\n");
    sb.append("Pet: ").append(getPet().getNome()).append("\n");
    sb.append("Data: ").append(getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append("\n");
    sb.append("Serviços incluídos:\n");
    for (Servico s : servicos) {
        sb.append(" - ").append(s.getTipo()).append(": R$").append(s.getPreco()).append("\n");
    }
    sb.append("Total com desconto: R$").append(getPreco());
    return sb.toString();
}

}
