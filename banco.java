
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "2348";
        double saldo = 2500.00;
        int opcao = 0;
        System.out.println("Digite seu senha :");
        String senhauser = sc.nextLine();

        if (senha.equals(senhauser)) {
            System.out.println("""
                    Entrando...
                    \n
                    
                    Nome:       Altair dos santos
                    Tipo de conta:     corrente
                    Data de nascimento:    23/11/1976""");

        }
        else {
            System.out.println("Senha invalida");
            sc.close();

        }


        System.out.println("\n***********************************");




        String menu = """ 
        \n
        Digite 1 para visualizar saldo:
        Digite 2 para recebeer:
        Digite 3 para transferir:
        Digite 4 para sair:""";
        Scanner user2= new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = user2.nextInt();
            if (opcao == 1 ) {
                System.out.println("esse é seu saldo " + saldo);
            }
            else if (opcao == 2 ) {
                System.out.println("Qual o valor a receber?");
                int valor = sc.nextInt();
                double resultado = saldo + valor;

                System.out.println("Saldo atual: " + resultado);
        }
            else if (opcao == 3 ) {
                System.out.println("Qual o valor a transferir?");
                int valor = sc.nextInt();
                double resultado = saldo - valor;
                if ( valor > saldo ) {
                    System.out.println("Saldo negativo");
                }
                else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + resultado);
                }

            }
            else if (opcao == 4 ) {
                System.out.println("Obrigado, volte sempre.");
                sc.close();
            }

        }

    }


}
