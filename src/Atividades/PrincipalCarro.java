package Atividades;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro carros = new Carro();
        carros.modelo = "Hatch";
        carros.anoFab = 2004;
        carros.cor = "Vermelho";

        carros.exibirFichaTecnicaCarro();

        System.out.println("Idade do carro: " + carros.calcularIdade());
    }
}
