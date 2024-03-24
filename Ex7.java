import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int greaterNumber = 0;
        for (int i = 1; i < numbers.length; i++) {
            greaterNumber = Math.max(greaterNumber, numbers[i]);
        }

        System.out.println("O maior número é: " + greaterNumber);

        scan.close();
    }
}
