package Records;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Nah");
        aluno.setEmail("1111@gmail.com");
        aluno.setTelefone("9999999999");
        System.out.println(aluno.getNome());

        AlunoRecord alunoR = new AlunoRecord("Fah", "2222@gmail.com", "88888888888");
        alunoR.nome();
        System.out.println(alunoR.email());

        //alunoR.email = "newEmail@gmail.com"; -> isso aq n funciona pq é imutável

    }
}
