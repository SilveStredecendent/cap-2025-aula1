package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Gradle!!!");

        Aluno a1 = new aluno();
        a1.setId(1);
        a1.setNome("Marco");
        a1.setIdade(45);

        System.out.println(a1.getId());
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());

        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Estrutura de Dados");
        t1.setConcluido(true);

        System.out.println(t1.getDescricao());

    }
}