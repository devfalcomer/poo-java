package Atividades;

public class PrincipalMusica {
    public static void main(String[] args) {
        Musica musicas = new Musica();
        musicas.titulo = "Mockingbird";
        musicas.artista = "Eminem";
        musicas.anoLancamento = 2002;

        musicas.exibirFichaTecnicaMusica();
        musicas.avalia(8);
        musicas.avalia(5);
        musicas.avalia(10);
        System.out.println(musicas.somaDasAvaliacoes);
        System.out.println(musicas.numAvaliacoes);
        System.out.println(musicas.obterMedia());
    }
}
