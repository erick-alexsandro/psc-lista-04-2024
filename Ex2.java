import java.io.Console;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Console console = System.console();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite nome de usuário: ");
            String user = scan.nextLine();

            System.out.print("Digite senha: ");
            char[] passChars = console.readPassword();
            String pass = new String(passChars);

            if (!pass.equals(user)) {
                System.out.println("Bem vindo!");
                break;
            } else {
                System.out.println("Usuário ou senha inválida! Digite novamente.");
            }
        }

        scan.close();
    }
}
