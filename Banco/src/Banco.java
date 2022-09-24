import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op=1;

        Conta_poupanca cp0001 = new Conta_poupanca();
        Conta_poupanca cp0002 = new Conta_poupanca();
        Conta_poupanca cp0003 = new Conta_poupanca();

        cp0001.cria_conta(200, 0.09, "José Bezerra");
        cp0002.cria_conta(35456.88, 0.047, "Maria Touro");
        cp0003.cria_conta(300.36, 0.08, "João Ovelha");

        cp0001.exibe_dados();

        do{
            System.out.println("\t\t\t***Sistema Bancário!\n"
            + "Digite as opções de acordo com a função que deseja realizar:\n"
            + "1 - Para sacar da conta\n"
            + "2 - Para depositar na conta\n"
            + "3 - Para remunerar na conta\n"
            + "4 - Para transferir da conta\n"
            + "5 - Para sair\n"            
            );
            op = scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite o valor a ser sacado: ");
                    cp0001.sacar(scan.nextDouble());
                    cp0001.exibe_transacao();
                    break;
                
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    cp0001.depositar(scan.nextDouble());
                    cp0001.exibe_transacao();
                    break;
                
                case 3:
                    cp0001.remunerar();
                    cp0001.exibe_transacao();
                    break;

                case 4:
                    cp0001.exibe_transacao();
                    cp0003.exibe_transacao();

                    System.out.println("Transferindo pra conta CP0003!");
                    System.out.println("Digite o valor a ser transferido: ");
                    cp0001.transferir(cp0003, scan.nextDouble());
                    
                    cp0001.exibe_transacao();
                    cp0003.exibe_transacao();

                    break;

                default:
                    if(op==5){
                        System.out.println("Saindo do sistema...");
                    }else{
                        System.out.println("\t\tOpção Inválida!");
                    }

            }
        }while(op != 5);
        scan.close();
    }
}
