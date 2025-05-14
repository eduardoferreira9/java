import java.util.ArrayList;

class Veiculo {
    private String placa;
    private String marca;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}

class Carro extends Veiculo {
    private int quantidadeRodas;
    private int quantidadePortas;
    private int quantidadeCilindros;

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeCilindros() {
        return quantidadeCilindros;
    }

    public void setQuantidadeCilindros(int quantidadeCilindros) {
        this.quantidadeCilindros = quantidadeCilindros;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de rodas: " + getQuantidadeRodas());
        System.out.println("Quantidade de portas: " + getQuantidadePortas());
        System.out.println("Quantidade de cilindros: " + getQuantidadeCilindros());
    }
}

class Moto extends Veiculo {
    private String tipoTransmissao;
    private double anguloInclinacao;
    private int cilindradas;

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public double getAnguloInclinacao() {
        return anguloInclinacao;
    }

    public void setAnguloInclinacao(double anguloInclinacao) {
        this.anguloInclinacao = anguloInclinacao;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de transmissão: " + getTipoTransmissao());
        System.out.println("Ângulo máximo de inclinação: " + getAnguloInclinacao());
        System.out.println("Cilindradas: " + getCilindradas());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Carro carro1 = new Carro();
        carro1.setPlaca("OIJ19J");
        carro1.setMarca("Honda");
        carro1.setModelo("Civic");
        carro1.setQuantidadeCilindros(4);
        carro1.setQuantidadeRodas(4);
        carro1.setQuantidadePortas(4);

        Carro carro2 = new Carro();
        carro2.setPlaca("KJ97K1");
        carro2.setMarca("Porsche");
        carro2.setModelo("911");
        carro2.setQuantidadeCilindros(6);
        carro2.setQuantidadeRodas(4);
        carro2.setQuantidadePortas(2);

        Moto moto = new Moto();
        moto.setPlaca("ABC1234");
        moto.setMarca("Yamaha");
        moto.setModelo("MT-09");
        moto.setTipoTransmissao("Corrente");
        moto.setAnguloInclinacao(45.0);
        moto.setCilindradas(900);

        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(moto);

        for (Veiculo v : veiculos) {
            System.out.println("----------------------------");
            v.exibirDados();
        }
    }
}

        //----------------------- Respostas dos questionário: -----------------------//

        // 1. Se for subsclasses ele mostrará todos os atributos normalmente.

        // 2. Da para misturar duas classes na mesma classe sem se preocupar com o tipo.

        // 3. Ia somente mostrar os dados da superclasse Veiculo.
