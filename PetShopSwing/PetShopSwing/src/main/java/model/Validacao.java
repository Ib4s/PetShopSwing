/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

public class Validacao {

    // Valida email com formato nome@dominio.extensão
    public static boolean validarEmail(String email) {
        if (email == null) return false;
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida telefone com 9 a 12 dígitos, ignorando espaços em branco
public static boolean validarTelefone(String telefone) {
    if (telefone == null) return false;

    // Remove todos os espaços em branco (inclusive tabs, quebras de linha, etc.)
    String apenasDigitos = telefone.replaceAll("\\s+", "");

    // Verifica se restam apenas dígitos e se há entre 9 e 12
    return apenasDigitos.matches("\\d{9,12}");
}


    // Valida se a data está no futuro
    public static boolean validarDataFutura(LocalDate data) {
        if (data == null) return false;
        return data.isAfter(LocalDate.now());
    }

    // Valida peso (maior que 0)
    public static boolean validarPeso(double peso) {
        return peso > 0;
    }

    // Valida idade (maior que 0)
    public static boolean validarIdade(int idade) {
        return idade > 0;
    }

    public static boolean validarIdadePeso(int idade, double peso) {
    // Validar idade e peso com base nos métodos já existentes
    return validarIdade(idade) && validarPeso(peso);
}

}
