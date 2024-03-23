import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int again;

        do {
            System.out.print("Escreva a população A: ");
            long a = scan.nextLong();
            while (a <= 0) {
                System.out.println("Deve ser um número positivo. Tente novamente.");
                System.out.print("Escreva a população A: ");
                a = scan.nextLong();
            }

            System.out.print("Escreva a taxa de crescimento para a população A: ");
            double PercentageA = scan.nextDouble();
            while (PercentageA <= 0) {
                System.out.println("Deve ser um número positivo.");
                System.out.print("Escreva a taxa de crescimento para a população A: ");
                PercentageA = scan.nextDouble();
            }

            System.out.print("Escreva a população B: ");
            long b = scan.nextLong();
            while (b <= 0) {
                System.out.println("Deve ser um número positivo. Tente novamente.");
                System.out.print("Escreva a população B: ");
                b = scan.nextLong();
            }

            System.out.print("Escreva a taxa de crescimento para a população B: ");
            double PercentageB = scan.nextDouble();
            while (PercentageB <= 0) {
                System.out.println("Deve ser um número positivo. Tente novamente.");
                System.out.print("Escreva a taxa de crescimento para a população B: ");
                PercentageB = scan.nextDouble();
            }

            int years = 0;

            while (a < b) {
                a += a * (PercentageA / 100);
                b += b * (PercentageB / 100);
                years++;
            }

            System.out.println("País A: " + a);
            System.out.println("País B: " + b);
            System.out.println("O país A somente ultrapassará o país B após " + years + " anos.");
            System.out.println("Tentar novamente? (1 - Sim / 2 - Não)");
            again = scan.nextInt();
        } while (again == 1);

        scan.close();
    }
}