package Es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero per il countdown: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        scanner.close();
    }
}
