
package aula09ex03.testecontas;

//classe abstrata
abstract class ContaBancária {
    //atributos
    protected double saldo;
    protected int númeroDaConta;

    public ContaBancária(int númeroDaConta) {
        this.númeroDaConta = númeroDaConta;
        this.saldo = 0.0;
    }
    
    //método abstrato
    public abstract void depositar(double valor);
    
    //método abstrato
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}
//subclasse
class ContaCorrente extends ContaBancária {
    private double taxaDeOperação;

    public ContaCorrente(int númeroDaConta, double taxaDeOperação) {
        super(númeroDaConta);
        this.taxaDeOperação = taxaDeOperação;
    }

    public void depositar(double valor) {
        saldo += valor - taxaDeOperação;
    }

    public void sacar(double valor) {
        saldo -= valor + taxaDeOperação;
    }
}

//subclasse
class ContaPoupança extends ContaBancária {
    private double limiteDeSaque;

    public ContaPoupança(int númeroDaConta, double limiteDeSaque) {
        super(númeroDaConta);
        this.limiteDeSaque = limiteDeSaque;
    }
    
    //método
    public void depositar(double valor) {
        saldo += valor;
    }
    
    //método
    public void sacar(double valor) {
        if (valor <= limiteDeSaque) {
            saldo -= valor;
        } else {
            System.out.println("Erro: Limite de saque excedido.");
        }
    }
}

//classe que instancia objetos de cada uma das subclasses, realiza algumas 
//operações de depósito e saque e exibe o saldo resultante
public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(3109, 1.50);
        ContaPoupança contaPoupança = new ContaPoupança(9999, 243.0);

        contaCorrente.depositar(5000.0);
        contaCorrente.sacar(300.0);

        contaPoupança.depositar(1200.0);
        contaPoupança.sacar(48.0);
        
        
        System.out.println("----------- SALDOS -----------\n\n");
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + contaPoupança.getSaldo());
    }
}