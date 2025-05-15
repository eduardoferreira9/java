// Classe Loja

class Loja {
    private int identificadorLoja;
    private String nomeLoja;
    private String enderecoLoja;
    private String cnpjLoja;
    private String emailLoja;
    private String produtosLoja;

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
        if(cnpjLoja.length() > 11 || cnpjLoja.length() <= 0) {
            System.out.println("Error! CNPJ tem um range de apenas 11 caracteres!");
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

    public String getProdutosLoja() {
        return produtosLoja;
    }

    public void setProdutosLoja(String produtosLoja) {
        this.produtosLoja = produtosLoja;
    }

    public void inserirLoja(String nomeLoja, String enderecoLoja, String cnpjLoja, String emailLoja, String produtosLoja) {
        setNomeLoja(nomeLoja);
        setEnderecoLoja(enderecoLoja);
        setCnpjLoja(cnpjLoja);
        setEmailLoja(emailLoja);
        setProdutosLoja(produtosLoja);
    }

    public void exibirLoja() {
        System.out.println("Nome da Loja: " + getNomeLoja());
        System.out.println("Endereço da Loja: " + getEnderecoLoja());
        System.out.println("CNPJ da Loja: " + getCnpjLoja());
        System.out.println("Email da Loja: " + getEmailLoja());
        System.out.println("Produtos da Loja: " + getProdutosLoja());
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
        System.out.println("Marca do produto: " + getNomeProdutos());
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
        System.out.println("Eficiencia energetica do fogão: " + getEficienciaEnergeticaProdutos());
        System.out.println("Voltagem do fogão: " + getVoltagemProdutos());
        System.out.println("Número de bocas do fogão: " + getNumerodebocasFogao());
    }
}

// Ainda precisa terminar geladeira e tv