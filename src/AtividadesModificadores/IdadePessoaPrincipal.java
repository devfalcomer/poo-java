package AtividadesModificadores;

public class IdadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa idade1 = new IdadePessoa();
        idade1.setIdade(26);
        idade1.setNome("Arthur");

        IdadePessoa idade2 = new IdadePessoa();
        idade2.setIdade(10);
        idade2.setNome("César");

        System.out.println("Nome da primeira pessoa: " + idade1.getNome());
        System.out.println("Idade da primeira pessoa: " + idade1.getIdade());
        idade1.verificarIdade();

        System.out.println("Nome da primeira pessoa: " + idade2.getNome());
        System.out.println("Idade da primeira pessoa: " + idade2.getIdade());
        idade2.verificarIdade();
    }
}
