import java.util.ArrayList;

class Animal {
    public void emitirSom() {
        System.out.println("O animal faz som...");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau! Miau!");
    }
}

class Papagaio extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Pru! Pru!");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();

        animais.add(cachorro);
        animais.add(gato);
        animais.add(papagaio);

        for(Animal a : animais) {
            a.emitirSom();
        }
    }
}