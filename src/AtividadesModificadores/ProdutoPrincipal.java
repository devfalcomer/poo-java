package AtividadesModificadores;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("PlayStation 5");
        produto.setPreco(3000);

        System.out.println("O produto que você comprou foi: " + produto.getNome());
        System.out.println("O produto que você comprou foi: " + produto.getPreco());
        produto.aplicarDesconto(20);
    }
}
