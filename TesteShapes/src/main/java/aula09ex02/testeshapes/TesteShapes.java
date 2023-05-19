
package aula09ex02.testeshapes;

//classe abstrata
abstract class Shape {
    public abstract double calcularÁrea();
}

//subclasse
class Retângulo extends Shape {
    private double comprimento;
    private double largura;

    public Retângulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularÁrea() {
        return comprimento * largura;
    }
}

//subclasse
class Círculo extends Shape {
    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    //método
    public double calcularÁrea() {
        return Math.PI * raio * raio;
    }
}
//classe que instancia objetos de cada uma das subclasses e chama o método
public class TesteShapes {
    public static void main(String[] args) {
        Retângulo retângulo = new Retângulo(6, 9);
        Círculo círculo = new Círculo(10);

        double áreaRetângulo = retângulo.calcularÁrea();
        double áreaCírculo = círculo.calcularÁrea();

        System.out.println(" *-*-*-*-*- Áreas -*-*-*-*-* \n");
        System.out.println("Área do Retângulo: " + áreaRetângulo);
        System.out.println("Área do Círculo: " + áreaCírculo);
    }
}