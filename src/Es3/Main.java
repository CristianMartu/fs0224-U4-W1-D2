package Es3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String check = scanner.nextLine();
        while (!Objects.equals(check, ":q")) {
            for (int i = 0; i < check.length(); i++) {
                if (i == check.length() - 1) System.out.println(check.charAt(i));
                else System.out.print(check.charAt(i) + ",");
            }
            System.out.print("Inserisci una nuova stringa o ':q' per terminare: ");
            check = scanner.nextLine();
        }
        scanner.close();
    }
}
