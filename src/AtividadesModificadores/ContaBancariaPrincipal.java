package AtividadesModificadores;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        banco.titular = "Arthur Falcomer";
        banco.setNumeroConta(238908);
        banco.setSaldo(200000);

        System.out.println("Titular da conta: " + banco.titular);
        System.out.println("Número da conta: " + banco.getNumeroConta());
        System.out.println("Saldo gda conta: " + banco.getSaldo());

    }
}
