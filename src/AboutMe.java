import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá me chamo " + nome + " " +  sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm ");

        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }

}
