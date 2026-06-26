package calculadora;

import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
                double n1 = sc.nextDouble();

                System.out.print("DIGITE O SEGUNDO NÚMERO: ");
                double n2 = sc.nextDouble();

                Operacoes op = new Operacoes(n1, n2);

                System.out.printf("➕ A SOMA: %.2f + %.2f = %.2f%n", n1, n2, op.somar());
                System.out.printf("➖ A SUBTRAÇÃO: %.2f - %.2f = %.2f%n", n1, n2, op.subtrair());
                System.out.printf("➗ A DIVISÃO: %.2f / %.2f = %.2f%n", n1, n2, op.dividir());
                System.out.printf("✖ A MULTIPLICAÇÃO: %.2f x %.2f = %.2f%n", n1, n2, op.multiplicar());

            } catch (Exception e) {
                System.out.println("⚠️ ERRO: Entrada inválida. Digite apenas números.");
                sc.nextLine();
                continue;
            }

            System.out.print("Deseja continuar? (s/n): ");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Encerrando calculadora...");
                break;
            }
        }

        sc.close();
    }
}
