import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        } else {
            while (num2 <= num1) {
                System.out.println(num1);
                num1--;
            }
        }

        scan.close();
    }
}