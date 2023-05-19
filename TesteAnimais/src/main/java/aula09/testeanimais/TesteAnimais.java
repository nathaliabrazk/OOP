
package aula09.testeanimais;

//criação da classe abstrata
abstract class Animal {
    //método abstrato
    public abstract void emitirSom();
}


class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("'Au au! é o som que o cachorro emite.'");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("'Miau!' é o som que o gato emite.");
    }
}
//classe pública que que instancia
//objetos de cada uma das subclasses e chama o método
public class TesteAnimais {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.emitirSom(); // Chamada do método emitirSom() da classe Cachorro
        gato.emitirSom(); // Chamada do método emitirSom() da classe Gato
    }
}
