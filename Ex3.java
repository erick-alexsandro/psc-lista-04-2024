import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva seu nome (Maior que 3 caracteres): ");
        String name = scan.nextLine();
        while (name.length() <= 3) {
            System.out.print("Nome inválido. Escreva seu nome (Maior que 3 caracteres): ");
            name = scan.nextLine();
        }

        System.out.print("Escreva sua idade: ");
        int age = scan.nextInt();
        while (age > 150 || age < 0) {
            System.out.print("Idade inválida. Escreva sua idade: ");
            age = scan.nextInt();
        }

        System.out.print("Escreva seu salário (Maior que zero): ");
        double salary = scan.nextDouble();
        while (salary <= 0) {
            System.out.print("Salário inválido. Escreva seu salário (Maior que zero): ");
            salary = scan.nextDouble();
        }

        System.out.print("Escreva seu sexo (f/m): ");
        String sex = scan.nextLine();
        while (!sex.equals("f") && !sex.equals("m")) {
            System.out.print("Sexo inválido. Escreva seu sexo (f/m): ");
            sex = scan.nextLine();
        }

        System.out.print("Escreva seu estado cívil (s/c/v/d): ");
        String status = scan.nextLine();
        while (!status.equals("s") && !status.equals("c") && !status.equals("v") && !status.equals("d")) {
            System.out.print("Estado civil inválido. Escreva seu estado cívil (s/c/v/d): ");
            status = scan.nextLine();
        }

        scan.close();
    }
}
