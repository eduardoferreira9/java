// ----   Classes abstratas ----   //
abstract class Veiculo {
    private String marca, modelo, cor, chassi, placa;
    private int ano, quilometragem, capacidadePassageiros, peso, potencia;
    abstract void ligar();  
    abstract void desligar(); 
    abstract void acelerar(); 
    abstract void frear(); 
    abstract void buzinar();
    abstract void abastecer(); 
    abstract void abrirPorta(); 
    abstract void fecharPorta(); 
    abstract void trocarMarcha(); 
    abstract void mostrarPainel();
}

abstract class Funcionario {
    private String nome, cargo, departamento, cpf, endereco;
    private int idade, idFuncionario, salario, anosEmpresa, cargaHoraria;
    abstract void trabalhar(); 
    abstract void baterPonto(); 
    abstract void tirarFerias(); 
    abstract void receberSalario(); 
    abstract void pedirDemissao();
    abstract void relatarProblema(); 
    abstract void participarReuniao();
    abstract void cumprirMeta();
    abstract void realizarTreinamento();
    abstract void emitirRelatorio();

}

abstract class Produto {
    private String nome, codigoBarras, categoria, fabricante, descricao;
    private double preco, peso, altura, largura, profundidade;
    abstract void calcularDesconto(); 
    abstract void aplicarPromocao(); 
    abstract void atualizarEstoque(); 
    abstract void registrarVenda(); 
    abstract void verificarValidade();
    abstract void embalar(); 
    abstract void etiquetar(); 
    abstract void retornarFornecedor(); 
    abstract void avaliarProduto(); 
    abstract void exibirInformacoes();
}

abstract class Animal {
    private String especie, nome, habitat, alimentacao, comportamento;
    private int idade, peso, altura, tempoGestacao, numeroPatas;
    abstract void comer(); 
    abstract void dormir(); 
    abstract void mover(); 
    abstract void comunicar(); 
    abstract void reproduzir();
    abstract void caçar(); 
    abstract void fugir(); 
    abstract void cuidarFilhotes(); 
    abstract void explorarAmbiente(); 
    abstract void beberAgua();
}

abstract class Computador {
    private String processador, placaMae, sistemaOperacional, tipoHD, placaVideo;
    private int memoriaRAM, armazenamento, portasUSB, polegadasMonitor, anoFabricacao;
    abstract void ligar(); 
    abstract void desligar(); 
    abstract void instalarSoftware(); 
    abstract void desinstalarSoftware(); 
    abstract void reiniciar();
    abstract void atualizarSistema(); 
    abstract void acessarInternet(); 
    abstract void salvarArquivo(); 
    abstract void imprimir(); 
    abstract void monitorarDesempenho();
}

// ----   Classes concretas ----   //
class Carro extends Veiculo {
    void ligar() {} 
    void desligar() {} 
    void acelerar() {} 
    void frear() {} 
    void buzinar() {}
    void abastecer() {} 
    void abrirPorta() {} 
    void fecharPorta() {} 
    void trocarMarcha() {} 
    void mostrarPainel() {}
}

class Desenvolvedor extends Funcionario {
    void trabalhar() {} 
    void baterPonto() {} 
    void tirarFerias() {} 
    void receberSalario() {} 
    void pedirDemissao() {}
    void relatarProblema() {} 
    void participarReuniao() {} 
    void cumprirMeta() {} 
    void realizarTreinamento() {} 
    void emitirRelatorio() {}
}

class Eletronico extends Produto {
    void calcularDesconto() {} 
    void aplicarPromocao() {} 
    void atualizarEstoque() {} 
    void registrarVenda() {} 
    void verificarValidade() {}
    void embalar() {} 
    void etiquetar() {} 
    void retornarFornecedor() {} 
    void avaliarProduto() {} 
    void exibirInformacoes() {}
}

class Cachorro extends Animal {
    void comer() {} 
    void dormir() {} 
    void mover() {} 
    void comunicar() {} 
    void reproduzir() {}
    void caçar() {} 
    void fugir() {} 
    void cuidarFilhotes() {} 
    void explorarAmbiente() {} 
    void beberAgua() {}
}

class Notebook extends Computador {
    void ligar() {} 
    void desligar() {} 
    void instalarSoftware() {} 
    void desinstalarSoftware() {} 
    void reiniciar() {}
    void atualizarSistema() {} 
    void acessarInternet() {} 
    void salvarArquivo() {} 
    void imprimir() {} 
    void monitorarDesempenho() {}
}
