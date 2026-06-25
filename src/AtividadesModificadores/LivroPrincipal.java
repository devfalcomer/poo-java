package AtividadesModificadores;

public class LivroPrincipal {
    public static void main(String[] args) {
        Livro livros = new Livro();
        livros.setTitulo("Harry Potter");
        livros.setAutor("Alguem");

        livros.exibirDetalhesLivro();
    }
}
