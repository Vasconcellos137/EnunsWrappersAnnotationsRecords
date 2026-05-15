package Annotations;

@MyAnnotation(nome = "sla") //class com minhas próprias annotations

public class Aluno {
    private String nome;
    private String email;
    private String telefone;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override //Annotation
    public String toString() {
        return "Aluno [nome=" + nome + ", email=" + email + "telefone=" + telefone;
    }
}
