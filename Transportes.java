
package projetopoo.transportes;
import java.util.Scanner;

//classe principal
public class Transportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do usuário: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Usuario usuario = new Usuario(nome, idade);

        System.out.print("Digite o meio de transporte desejado (metrô/ônibus): ");
        String meioTransporte = scanner.nextLine();

        if (meioTransporte.equalsIgnoreCase("metrô")) {
            System.out.println("Opções de estações de metrô:");
            System.out.println("1. Central");
            System.out.println("2. Galeria");
            System.out.println("3. 102 Sul");
            System.out.println("4. 104 Sul");
            System.out.println("5. 106 Sul");
            System.out.println("6. 108 Sul");
            System.out.println("7. 110 Sul");
            System.out.println("8. 112 Sul");
            System.out.println("9. 114 Sul");
            System.out.println("10. Asa Sul");
            System.out.println("11. Shopping");
            System.out.println("12. Feira");
            System.out.println("13. Guará");
            System.out.println("14. Arniqueiras");
            System.out.println("15. Águas Claras");
            System.out.println("16. Concessionárias");
            System.out.println("17. Estrada Parque");
            System.out.println("18. Praça do Relógio");
            System.out.println("19. Onoyama");
            System.out.println("20. Centro Metropolitano");
            System.out.println("21. Ceilândia Sul");
            System.out.println("22. Linha Ceilândia");
            System.out.println("23. Samambaia");

            System.out.print("Digite o número da estação escolhida: ");
            int estacaoEscolhida = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            usuario.setEstacaoMetrô(getEstacaoMetrô(estacaoEscolhida));
            System.out.println("Opção escolhida: " + usuario.getEstacaoMetrô());
        } else if (meioTransporte.equalsIgnoreCase("ônibus")) {
            System.out.println("Opções de empresas de ônibus:");
            System.out.println("1. TCB");
            System.out.println("2. VIAÇÃO PIRACICABANA");
            System.out.println("3. VIAÇÃO PIONEIRA");
            System.out.println("4. VIAÇÃO MARECHAL");
            System.out.println("5. SÃO JOSÉ");

            System.out.print("Digite o número da empresa escolhida: ");
            int empresaEscolhida = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            usuario.setEmpresaOnibus(getEmpresaOnibus(empresaEscolhida));
            System.out.println("Opção escolhida: " + usuario.getEmpresaOnibus());
        } else {
            System.out.println("Meio de transporte não reconhecido.");
        }
    }

    public static String getEstacaoMetrô(int opcao) {
        switch (opcao) {
            case 1:
                return "Central";
            case 2:
                return "Galeria";
            case 3:
                return "102 Sul";
            case 4:
                return "104 Sul";
            case 5:
                return "106 Sul";
            case 6:
                return "108 Sul";
            case 7:
                return "110 Sul";
            case 8:
                return "112 Sul";
            case 9:
                return "114 Sul";
            case 10:
                return "Asa Sul";
            case 11:
                return "Shopping";
            case 12:
                return "Feira";
            case 13:
                return "Guará";
            case 14:
                return "Arniqueiras";
            case 15:
                return "Águas Claras";
            case 16:
                return "Concessionárias";
            case 17:
                return "Estrada Parque";
            case 18:
                return "Praça do Relógio";
            case 19:
                return "Onoyama";
            case 20:
                return "Centro Metropolitano";
            case 21:
                return "Ceilândia Sul";
            case 22:
                return "Linha Ceilândia";
            case 23:
                return "Samambaia";
            default:
                return "Opção inválida";
        }
    }

    public static String getEmpresaOnibus(int opcao) {
        switch (opcao) {
            case 1:
                return "TCB";
            case 2:
                return "VIAÇÃO PIRACICABANA";
            case 3:
                return "VIAÇÃO PIONEIRA";
            case 4:
                return "VIAÇÃO MARECHAL";
            case 5:
                return "SÃO JOSÉ";
            default:
                return "Opção inválida";
        }
    }
}

class Usuario {
    private String nome;
    private int idade;
    private String estacaoMetrô;
    private String empresaOnibus;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstacaoMetrô() {
        return estacaoMetrô;
    }

    public void setEstacaoMetrô(String estacaoMetrô) {
        this.estacaoMetrô = estacaoMetrô;
    }

    public String getEmpresaOnibus() {
        return empresaOnibus;
    }

    public void setEmpresaOnibus(String empresaOnibus) {
        this.empresaOnibus = empresaOnibus;
    }
}