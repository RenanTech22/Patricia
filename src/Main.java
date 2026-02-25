import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int N = 30;

        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];

        rm[0] = 1;

        int i = 0;

        System.out.print("Informe RM (negativo para encerrar): ");

        int a = sc.nextInt();

        for (i = 0; i < N && a > 0; i++) {

            if (i == 0) {
                rm[i] = a;
            }

            System.out.print("Qual a primeira nota do " + (i + 1) + "° aluno? ");
            nota1[i] = sc.nextDouble();

            System.out.print("Qual a segunda nota " + (i + 1) + "° aluno? ");
            nota2[i] = sc.nextDouble();

            System.out.println();

            System.out.print("Informe RM (negativo para encerrar): ");
            a = sc.nextInt();

            if (a > 0) {
                rm[i] = a;
            }


        }

        double[] media = new double[i];

        for (int n = 0; n < i; n++) {

            media[n] = (nota1[n] + nota2[n]) / 2;

            if (media[n] >= 6) {

                System.out.println("RM: " + rm[n] + " aprovado, média: " + media[n]);

            }

        }

    }
}
