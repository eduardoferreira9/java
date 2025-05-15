import java.util.ArrayList;
import java.util.List;

class Loja {
    private int identificadorLoja;
    private String nomeLoja;
    private String enderecoLoja;
    private String cnpjLoja;
    private String emailLoja;
    private List<Produtos> produtosLoja = new ArrayList<>();

    public int getIdentificadorLoja() {
        return identificadorLoja;
    }

    public void setIdentificadorLoja(int identificadorLoja) {
        this.identificadorLoja = identificadorLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        if (cnpjLoja.length() != 11) {
            System.out.println("Error! CNPJ deve ter 11 caracteres!");
        } else {
            this.cnpjLoja = cnpjLoja;
        }
    }

    public String getEmailLoja() {
        return emailLoja;
    }

    public void setEmailLoja(String emailLoja) {
        this.emailLoja = emailLoja;
    }

    public void adicionarProduto(Produtos produto) {
        produtosLoja.add(produto);
    }

    public void inserirLoja(String nomeLoja, String enderecoLoja, String cnpjLoja, String emailLoja) {
        setNomeLoja(nomeLoja);
        setEnderecoLoja(enderecoLoja);
        setCnpjLoja(cnpjLoja);
        setEmailLoja(emailLoja);
    }

    public void exibirLoja() {
        System.out.println("Nome da Loja: " + getNomeLoja());
        System.out.println("Endereço da Loja: " + getEnderecoLoja());
        System.out.println("CNPJ da Loja: " + getCnpjLoja());
        System.out.println("Email da Loja: " + getEmailLoja());
    }

    public void exibirProdutosLoja() {
        for (Produtos produto : produtosLoja) {
            produto.exibirProdutos();
            System.out.println();
        }
    }
}

class Produtos {
    private int identificadorProdutos;
    private String nomeProdutos;
    private String marcaProdutos;
    private double eficienciaEnergeticaProdutos;
    private int voltagemProdutos;
    private double precoProdutos;

    public int getIdentificadorProdutos() {
        return identificadorProdutos;
    }

    public void setIdentificadorProdutos(int identificadorProdutos) {
        this.identificadorProdutos = identificadorProdutos;
    }

    public String getNomeProdutos() {
        return nomeProdutos;
    }

    public void setNomeProdutos(String nomeProdutos) {
        this.nomeProdutos = nomeProdutos;
    }

    public String getMarcaProdutos() {
        return marcaProdutos;
    }

    public void setMarcaProdutos(String marcaProdutos) {
        this.marcaProdutos = marcaProdutos;
    }

    public double getEficienciaEnergeticaProdutos() {
        return eficienciaEnergeticaProdutos;
    }

    public void setEficienciaEnergeticaProdutos(double eficienciaEnergeticaProdutos) {
        this.eficienciaEnergeticaProdutos = eficienciaEnergeticaProdutos;
    }

    public int getVoltagemProdutos() {
        return voltagemProdutos;
    }

    public void setVoltagemProdutos(int voltagemProdutos) {
        if (voltagemProdutos == 110 || voltagemProdutos == 220) {
            this.voltagemProdutos = voltagemProdutos;
        } else {
            System.out.println("Digite apenas a voltagem entre 110v e 220v!");
        }
    }

    public double getPrecoProdutos() {
        return precoProdutos;
    }

    public void setPrecoProdutos(double precoProdutos) {
        this.precoProdutos = precoProdutos;
    }

    public void inserirProdutos(String nomeProdutos, String marcaProdutos, double precoProdutos) {
        setNomeProdutos(nomeProdutos);
        setMarcaProdutos(marcaProdutos);
        setPrecoProdutos(precoProdutos);
    }

    public void exibirProdutos() {
        System.out.println("Nome do produto: " + getNomeProdutos());
        System.out.println("Marca do produto: " + getMarcaProdutos());
        System.out.println("Preço do produto: " + getPrecoProdutos());
    }
}

class Fogao extends Produtos {
    private int numerodebocasFogao;

    public int getNumerodebocasFogao() {
        return numerodebocasFogao;
    }

    public void setNumerodebocasFogao(int numerodebocasFogao) {
        if (numerodebocasFogao == 4 || numerodebocasFogao == 5 || numerodebocasFogao == 6) {
            this.numerodebocasFogao = numerodebocasFogao;
        } else {
            System.out.println("Erro! Apenas contamos com fogões de 4, 5 e 6 bocas.");
        }
    }

    public void inserirFogao(String nomeProdutos, String marcaProdutos, double precoProdutos, double eficienciaEnergeticaProdutos, int voltagemProdutos, int numerodebocasFogao) {
        super.inserirProdutos(nomeProdutos, marcaProdutos, precoProdutos);
        setEficienciaEnergeticaProdutos(eficienciaEnergeticaProdutos);
        setVoltagemProdutos(voltagemProdutos);
        setNumerodebocasFogao(numerodebocasFogao);
    }

    public void exibirFogao() {
        super.exibirProdutos();
        System.out.println("Eficiência energética do fogão: " + getEficienciaEnergeticaProdutos());
        System.out.println("Voltagem do fogão: " + getVoltagemProdutos());
        System.out.println("Número de bocas do fogão: " + getNumerodebocasFogao());
    }
}

class Geladeira extends Produtos {
    private double capacidadeGeladeira;
    private int numeroPrateleirasGeladeira;
    private int numeroPortasGeladeira;

    public double getCapacidadeGeladeira() {
        return capacidadeGeladeira;
    }

    public void setCapacidadeGeladeira(double capacidadeGeladeira) {
        this.capacidadeGeladeira = capacidadeGeladeira;
    }

    public int getNumeroPrateleirasGeladeira() {
        return numeroPrateleirasGeladeira;
    }

    public void setNumeroPrateleirasGeladeira(int numeroPrateleirasGeladeira) {
        this.numeroPrateleirasGeladeira = numeroPrateleirasGeladeira;
    }

    public int getNumeroPortasGeladeira() {
        return numeroPortasGeladeira;
    }

    public void setNumeroPortasGeladeira(int numeroPortasGeladeira) {
        this.numeroPortasGeladeira = numeroPortasGeladeira;
    }

    public void inserirGeladeira(String nomeProdutos, String marcaProdutos, double precoProdutos, double eficienciaEnergeticaProdutos, int voltagemProdutos, double capacidadeGeladeira, int numeroPrateleirasGeladeira, int numeroPortasGeladeira) {
        super.inserirProdutos(nomeProdutos, marcaProdutos, precoProdutos);
        setEficienciaEnergeticaProdutos(eficienciaEnergeticaProdutos);
        setVoltagemProdutos(voltagemProdutos);
        setCapacidadeGeladeira(capacidadeGeladeira);
        setNumeroPrateleirasGeladeira(numeroPrateleirasGeladeira);
        setNumeroPortasGeladeira(numeroPortasGeladeira);
    }

    public void exibirGeladeira() {
        super.exibirProdutos();
        System.out.println("Eficiência energética da geladeira: " + getEficienciaEnergeticaProdutos());
        System.out.println("Voltagem da geladeira: " + getVoltagemProdutos());
        System.out.println("Capacidade da geladeira: " + getCapacidadeGeladeira());
        System.out.println("Número de prateleiras da geladeira: " + getNumeroPrateleirasGeladeira());
        System.out.println("Número de portas da geladeira: " + getNumeroPortasGeladeira());
    }
}

class TV extends Produtos {
    private double polegadasTV;
    private int numeroEntradasHDMI;

    public double getPolegadasTV() {
        return polegadasTV;
    }

    public void setPolegadasTV(double polegadasTV) {
        this.polegadasTV = polegadasTV;
    }

    public int getNumeroEntradasHDMI() {
        return numeroEntradasHDMI;
    }

    public void setNumeroEntradasHDMI(int numeroEntradasHDMI) {
        this.numeroEntradasHDMI = numeroEntradasHDMI;
    }

    public void inserirTV(String nomeProdutos, String marcaProdutos, double precoProdutos, double eficienciaEnergeticaProdutos, int voltagemProdutos, double polegadasTV, int numeroEntradasHDMI) {
        super.inserirProdutos(nomeProdutos, marcaProdutos, precoProdutos);
        setEficienciaEnergeticaProdutos(eficienciaEnergeticaProdutos);
        setVoltagemProdutos(voltagemProdutos);
        setPolegadasTV(polegadasTV);
        setNumeroEntradasHDMI(numeroEntradasHDMI);
    }

    public void exibirTV() {
        super.exibirProdutos();
        System.out.println("Eficiência energética da TV: " + getEficienciaEnergeticaProdutos());
        System.out.println("Voltagem da TV: " + getVoltagemProdutos());
        System.out.println("Polegadas da TV: " + getPolegadasTV());
        System.out.println("Número de entradas HDMI da TV: " + getNumeroEntradasHDMI());
    }
}

public class Aula06 {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.inserirLoja("Loja de Eletrodomésticos", "Rua das Flores, 123", "13355798901", "loja1@gmail.com");
        loja.setIdentificadorLoja(1);

        Fogao fogao1 = new Fogao();
        fogao1.inserirFogao("Fogão 5 bocas", "Brastemp", 2000.0, 5.0, 220, 5);

        Fogao fogao2 = new Fogao();
        fogao2.inserirFogao("Fogão 4 bocas", "Consul", 1500.0, 4.5, 110, 4);

        Geladeira geladeira1 = new Geladeira();
        geladeira1.inserirGeladeira("Geladeira Frost Free", "Electrolux", 3000.0, 5.0, 220, 500.0, 5, 2);

        Geladeira geladeira2 = new Geladeira();
        geladeira2.inserirGeladeira("Geladeira Duplex", "Brastemp", 3500.0, 4.8, 110, 450.0, 4, 2);

        TV tv1 = new TV();
        tv1.inserirTV("TV 4K", "Samsung", 4000.0, 5.0, 220, 55.0, 4);

        TV tv2 = new TV();
        tv2.inserirTV("TV Full HD", "LG", 2500.0, 4.5, 110, 43.0, 2);

        loja.adicionarProduto(fogao1);
        loja.adicionarProduto(fogao2);
        loja.adicionarProduto(geladeira1);
        loja.adicionarProduto(geladeira2);
        loja.adicionarProduto(tv1);
        loja.adicionarProduto(tv2);

        loja.exibirLoja();
        System.out.println("\nProdutos disponíveis na loja:");
        loja.exibirProdutosLoja();
    }
}
