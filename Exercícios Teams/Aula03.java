public abstract class Aula03 {
    public abstract double calcularArea();

    public void exibirArea() {
        System.out.println("Área calculada: " + calcularArea());
    }
}

public class Circulo extends Aula03 {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }
}

public class Quadrado extends Aula03 {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado,2);
    }
}

public class Retangulo extends Aula03 {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Aula03 quadrado = new Quadrado(21);
        Aula03 circulo = new Circulo(4);
        Aula03 retangulo = new Retangulo(90, 82);

        System.out.println("Área do quadrado: ");
        quadrado.exibirArea();

        System.out.println("Área do circulo: ");
        circulo.exibirArea();

        System.out.println("Área do retângulo: ");
        retangulo.exibirArea();
    }
}