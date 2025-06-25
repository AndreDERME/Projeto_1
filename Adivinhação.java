import java.util.Scanner;
import java.util.Random;

public class ativ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumeroGerador = new Random().nextInt(100);
        int Tentativas = 0;


       while (Tentativas < 5) {
           System.out.println("Digite um numero para eu adivinhar: ");
           int numero = input.nextInt();
           Tentativas++;
           if (numero == NumeroGerador) {
               System.out.println("venceu");
               break;
           }
           else if (numero < NumeroGerador) {
               System.out.println("o numero esta um pouco mais pra cima :)");
           }
           else if (numero > NumeroGerador ) {
               System.out.println("o numero esta um pouco a baixo :)");
           }
           else {
               System.out.println("erro");
           }

       }

        System.out.println("esse era o numero escolhido " + NumeroGerador);    }


}

