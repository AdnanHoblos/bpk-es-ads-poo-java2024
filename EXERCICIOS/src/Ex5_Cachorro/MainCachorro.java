package Ex5_Cachorro;

public class MainCachorro {
    public static void main(String[] args) {
        // Criando um cachorro
        Cachorro dog1 = new Cachorro("Fritz", "Mountain Dragon", 8);

        // Exibindo informações do cachorro
        System.out.println(dog1);

        // Chamando os métodos latir e correr
        dog1.latir();
        dog1.correr();

        // Alterando a idade para um valor inválido (teste da validação)
        dog1.setIdade(-3);  // Deverá exibir a mensagem de erro e definir idade como 0
        System.out.println("Idade após tentativa de alteração inválida: " + dog1.getIdade());

        // Alterando a idade para um valor válido
        dog1.setIdade(5);
        System.out.println("Idade após alteração válida: " + dog1.getIdade());
    }
}
