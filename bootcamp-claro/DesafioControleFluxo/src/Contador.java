import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeriro Parâmetro");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo Parâmetro");
        int segundoParametro = terminal.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(primeiroParametro>segundoParametro){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = segundoParametro - primeiroParametro;
            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }

        }
    }
}