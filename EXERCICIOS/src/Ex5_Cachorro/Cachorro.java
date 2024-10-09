package Ex5_Cachorro;

//5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.

public class Cachorro {

    // Atributos privados
    private String nome;
    private String raca;
    private Integer idade;

    // Construtor
    public Cachorro(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        setIdade(idade); // Usando o setter para validar a idade
    }

    // Getters para atributos somente leitura fora da classe
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    // Setter para idade com validação
    public void setIdade(Integer idade) {
        if (idade < 0) {
            System.out.println("A idade não pode ser negativa. Definindo como 0.");
            this.idade = 0; // Se a idade for negativa, definimos como 0.
        } else {
            this.idade = idade;
        }
    }

    // Método para o cachorro latir
    public void latir() {
        System.out.println("Au Au Au");
    }

    // Método para o cachorro correr
    public void correr() {
        System.out.println("O Cachorro está correndoooo!!!");
    }

    // toString para exibir os dados do cachorro
    @Override
    public String toString() {
        return "Cachorro: " + nome + "\nRaca: " + raca + "\nIdade: " + idade;
    }
}
