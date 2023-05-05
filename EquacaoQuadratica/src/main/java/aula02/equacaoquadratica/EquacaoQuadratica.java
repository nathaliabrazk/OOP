
package aula02.equacaoquadratica;
import java.util.*;/*Para trabalhar com coleções, entrada de dados(scanner) e componentes de data e hora*/
public class EquacaoQuadratica {

    public static void main(String[] args) {
        /*Declaração de variáveis*/
        double a, b, c;
        Scanner le = new Scanner(System.in);
        System.out.print("Informe o valor de |a|:");
        
        /*Preenchimento de variáveis*/
        a = le.nextDouble();
        System.out.print("Informe o valor de |b|:");
        b = le.nextDouble();
        System.out.print("Informe o valor de |c|:");
        c = le.nextDouble();
        
        double Delta = (b * b) - (4 * a * c);
        double x1 = (- b + Math.sqrt(Delta)) / (2 * a);
        double x2 = (- b - Math.sqrt(Delta)) / (2 * a);
        /*Saída de dados*/
        System.out.println("Raizes: " + x1 + " e " + x2);
    }
}
