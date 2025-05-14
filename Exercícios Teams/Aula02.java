class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private char sexo;
    private String cpf;

    // Getters e Setters
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
    private double salario;
    private String disciplina;

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    void adicionarProfessor(String nome, String email, String telefone, int idade, char sexo, String cpf, double salario, String disciplina) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setIdade(idade);
        setSexo(sexo);
        setCpf(cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplina: " + this.disciplina);
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private double nota;

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    void adicionarAluno(String nome, String email, String telefone, int idade, char sexo, String cpf, String matricula, double nota) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setIdade(idade);
        setSexo(sexo);
        setCpf(cpf);
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
    private double salario;

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void adicionarSecretario(String nome, String email, String telefone, int idade, char sexo, String cpf, double salario) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setIdade(idade);
        setSexo(sexo);
        setCpf(cpf);
        this.salario = salario;
    }

    void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: " + this.salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Secretario secretario = new Secretario();

        // Classe professor
        professor.adicionarProfessor("Fábio", " fabio@unip.com", "16 99207-9573", 38, 'M', "5037446805", 5.013, "Lógica matemática");
        professor.exibirDados();

        System.out.println("======================================");

        // Classe aluno
        aluno.adicionarAluno("Eduardo", "ef09042@gmail.com", "17 99183-3981", 19, 'M', "93938985100", "R024FI0", 9.3);
        aluno.exibirDados();

        System.out.println("======================================");

        // Classe secretario
        secretario.adicionarSecretario("José", "jose@secretario.com", "16 992134-9573", 34, 'M', "503446805", 10.313);
        secretario.exibirDados();
    }
}