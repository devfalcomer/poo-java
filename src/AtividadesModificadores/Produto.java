package AtividadesModificadores;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desc){
        double desconto = preco - (desc / 100 * preco);
        System.out.println("Aplicando o desconto você vai pagar: " + desconto);
    }
}
