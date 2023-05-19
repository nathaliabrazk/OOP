
package aula09.testeanimais;

abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("O cachorro faz 'Au au!'");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("O gato faz 'Miau!'");
    }
}

public class TesteAnimais {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.emitirSom(); // Chamada do método emitirSom() da classe Cachorro
        gato.emitirSom(); // Chamada do método emitirSom() da classe Gato
    }
}
