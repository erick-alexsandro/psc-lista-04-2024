import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma nota: ");

        while (true) {
            System.out.print("Digite uma nota: ");
            int nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("Sua nota: " + nota);
                break;
            } else {
                System.out.print("Nota inválida! Digite novamente: ");
            }
        }

        scan.close();
    }

}