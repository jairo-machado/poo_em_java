public class Conta_poupanca {
    private double saldo;
    private double tx_juros;
    private String nome;

    public void cria_conta(double x, double y, String n){
        this.saldo = x;
        this.tx_juros = y;
        this.nome =n;
    }

    public void exibe_dados(){
        System.out.println("O nome do correntista é: " + nome);
        System.out.println("O saldo da conta é: " + saldo);
        System.out.println("A taxa de juros é: " + tx_juros);
        System.out.println("---FIM---");
    }

    public void exibe_transacao(){
        System.out.println("Valor após a transação: " + this + ": "+saldo);
    }

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }

    public void remunerar(){
        saldo *= 1 + tx_juros;
    }

    public void transferir(Conta_poupanca destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }

    
}
