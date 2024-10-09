package Ex1_Livro;

//AQUI NA MAIN VAMOS INSTANCIAR O OBJETO QUE FOI CRIADO NA CLASSE. CRIAR UM NOVO OBJETO DO MESMO TIPO DA CLASSE.
public class LivroMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Os cinco aneis", "Myamoto Musashi", 124);
        System.out.println(livro1);

        // CHAMANDO O MÉTODO abrirLivro
        livro1.abrirLivro();

        // CHAMANDO O MÉTODO lerPágina
        livro1.lerPagina();
    }
}

//RESULTADO DO PRINT:

/*
   Ex1_Livro.Livro:Os cinco aneis
   Autor:Myamoto Musashi
   Numero de Páginas:124

   Você abriu o livro: Os cinco aneisdo autorMyamoto Musashi
   Você está lendo uma página do livroOs cinco aneis
 */
