package AtividadesModificadores;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno alunos = new Aluno();
        alunos.setNome("Arthur");
        alunos.setNota1(10);
        alunos.setNota2(5);
        alunos.setNota3(7);

        System.out.println("Nome do aluno: " + alunos.getNome());
        System.out.println("Primeira nota do aluno: " + alunos.getNota1());
        System.out.println("Primeira nota do aluno: " + alunos.getNota2());
        System.out.println("Primeira nota do aluno: " + alunos.getNota3());
        alunos.calculaMedia();
    }
}
