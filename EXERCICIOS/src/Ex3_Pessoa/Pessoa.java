package Ex3_Pessoa;

/*3 - Implemente uma classe Ex3_Pessoa.Pessoa com atributos nome, idade, e altura.
 Adicione um método que imprime uma apresentação da pessoa.*/

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    void apresentacao(){
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos de idade e " + altura + " de altura");
    }
}


