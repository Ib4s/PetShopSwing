package model;
public class Pet {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Pet(String nome, String especie, String raca, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet other = (Pet) obj;
        return idade == other.idade &&
               Double.compare(peso, other.peso) == 0 &&
               nome.equals(other.nome) &&
               especie.equals(other.especie) &&
               raca.equals(other.raca);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, especie, raca, idade, peso);
    }

    @Override
    public String toString() {
        return nome + " (" + especie + ", " + raca + ")";
    }
}
