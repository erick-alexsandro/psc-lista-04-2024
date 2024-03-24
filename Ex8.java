import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;

        System.out.println("A soma dos números é: " + sum);
        System.out.println("A média dos números é: " + average);

        scan.close();
    }
}
