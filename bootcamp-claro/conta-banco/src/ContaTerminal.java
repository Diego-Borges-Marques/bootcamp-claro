import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");

        int numero = sc.nextInt();

        System.out.println("Por favor, insira a agencia !");

        sc.nextLine();
        String agencia = sc.nextLine();

        System.out.println("Por favor, insira seu nome !");

        String cliente = sc.nextLine();

        System.out.println("Por favor, deposite um valor inicial !");

        Double saldo = sc.nextDouble();

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!" ,
                cliente, agencia, numero,saldo);



    }
}