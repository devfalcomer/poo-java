package Atividades;

public class Carro {
    String modelo;
    int anoFab;
    String cor;

    void  exibirFichaTecnicaCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de Fabricação do carro: " + anoFab);
        System.out.println("Cor do carro: " + cor);
    }

    int calcularIdade(){
        return 2005 - anoFab;
    }
}
