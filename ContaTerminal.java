import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);      
        
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = leitor.nextLine();
        
        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = leitor.nextLine();

        System.out.println("Qual é o seu saldo atual? ");
        double saldo = leitor.nextDouble();      

        System.out.println("Por favor, digite sua conta: ");
        int numero = leitor.nextInt();      
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma cinta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
        leitor.close();
    }
}