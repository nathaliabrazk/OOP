
package aula02.fruitset;
import java.util.*;/*Para trabalhar com coleções, entrada de dados(scanner) e componentes de data e hora*/
class Macas{
    /*Atributos*/
   String tipo;
   String cor;
   String formato;
   int peso;
   
   /*Construtor*/
   public Macas(){
       Scanner le = new Scanner(System.in);
       System.out.print("Tipo: ");
       tipo = le.next();
       System.out.print("Cor: ");
       cor = le.next();
       System.out.print("Formato: ");
       formato = le.next();
       System.out.print("Peso(em gramas): ");
       peso = le.nextInt();
   }
   
   /*Método*/
   float calcCalorias(){
       float temp = 52f/100f * peso;
       return (temp);
   }
}

public class FruitSet {

    public static void main(String[] args) {
        
    }
}
