package Es1;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(annoBisestile(200));
    }

    public static boolean stringaPariDispari(String string) {
        return string.length() % 2 == 0;
    }

    public static boolean annoBisestile(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}