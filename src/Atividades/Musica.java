package Atividades;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double somaDasAvaliacoes;

    void  exibirFichaTecnicaMusica(){
        System.out.println("Nome do titulo: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Avaliações: " + numAvaliacoes);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double obterMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
