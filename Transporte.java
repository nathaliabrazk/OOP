
package projetopoo.transporte;

import java.util.Scanner;


public class Transporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o meio de transporte: ");
        String transporte = scanner.nextLine();

        String resposta = responde(transporte);
        System.out.println(resposta);
}
    public static String responde(String meioTransporte) {
        switch (meioTransporte.toLowerCase()) {
            case "ônibus":
                return "TRANSPORTE PÚBLICO";
            case "metrô":
                return "TRANSPORTE PÚBLICO";
            case "uber":
                return "APLICATIVO";
            case "99táxi":
                return "APLICATIVO";
            default:
                return "Meio de transporte não reconhecido.";
        }
    }
}
class Onibus {
    public String Cor;
    public String Empresa;
    public String Trajeto;
}

class Metro {
    public String Estacoes;
    public String Linha;
}

class _99Taxi {
    public String ModeloCarroTaxi;
    public String PlacaTaxi;
    public String NomeMotoristaTaxi;
}

class Uber {
    public String ModeloCarroUber;
    public String PlacaUber;
    public String NomeMotoristaUber;
}