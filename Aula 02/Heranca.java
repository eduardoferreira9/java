class Pessoa {
    public String nome;
    public String email;
    public String telefone;
    public int idade;
    public char sexo;
    public String cpf;


    void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("CPF: " + this.cpf);
    }
}

class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    void adicionarProfessor(String nome, String email, String telefone, int idade, char sexo, String cpf, double salario, String disciplina) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.salario = salario;
        this.disciplina = disciplina;
    }

    void exibirDados() {
        super.exibirDados();
        System.out.println("Salário:" + this.salario);
        System.out.println("Disciplinas: " + this.disciplina);
    }
}

class Aluno extends Pessoa {
    public String matricula;
    public double nota;

    void adicionarAluno(String nome, String email, String telefone, int idade, char sexo, String cpf, String matricula, double nota) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nota = nota;
    }

    void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
    }
}

class Secretario extends Pessoa {
    public double salario;

    void adicionarSecretario(String nome, String email, String telefone, int idade, char sexo, String cpf, double salario) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.salario = salario;
    }

    void exibirDados() {
        super.exibirDados();
        System.out.print("Salário: " + this.salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Secretario secretario = new Secretario();

        // Classe professor
        professor.adicionarProfessor("Fábio","fabio@unip.com","16 99207-9573", 38, 'M', "5037446805", 5.013, "Lógica matemática");
        professor.exibirDados();

        System.out.println("======================================");

        // Classe aluno
        aluno.adicionarAluno("Eduardo", "ef09042@gmail.com", "17 99183-3981", 19, 'M', "93938985100", "R024FI0", 9.3);
        aluno.exibirDados();

        System.out.println("======================================");

        // Classe secretario
        secretario.adicionarSecretario("José","jose@secretario.com","16 992134-9573", 34, 'M', "503446805", 10.313);
        secretario.exibirDados();
    }
}