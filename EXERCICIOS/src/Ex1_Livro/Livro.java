package Ex1_Livro;//
// Ex1_ Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas.
// Adicione métodos para abrir o livro e ler uma página.


//PRIMEIRO CRIAR O MOLDE, QUE É A CLASSE DO OBJETO.
public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroPaginas;


//SEGUNDO CRIAR O CONSTRUTOR (ALT+INSERT). SERVE PARA DAR UM VALOR INICIAL PARA OS ATRIBUTOS CRIADOS NA CLASSE
    public Livro(String titulo, String autor, Integer numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

//MÉTODOS SÃO COMO FUNÇÕES, VÃO FAZER ALGUMA MUDANÇA NOS ATRIBUTOS.
    void abrirLivro (){
        System.out.println("Você abriu o livro: " + this.titulo + "do autor" + this.autor);
    }

    void lerPagina (){
        System.out.println("Você está lendo uma página do livro" + this.titulo);
    }


//TO STRING SERVE PARA FORMATAR O JEITO QUE VAI SAIR O PRINTLN e SE NÃO TIVER ELE, O PRINT SAI COM O ENDEREÇO DE MEMÓRIA
    @Override
    public String toString() {
        return "Ex1_Livro.Livro:" + titulo + "\n" + "Autor:" + autor + "\n" + "Numero de Páginas:" + numeroPaginas + "\n";
    }
}//FECHA CLASSE

