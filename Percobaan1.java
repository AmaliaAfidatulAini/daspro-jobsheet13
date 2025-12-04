import java.util.Scanner;

public class Percobaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(faktorialRekrusif(5));
        System.out.println(faktorialIteratif(5));
    }

    static int faktorialRekrusif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekrusif(n - 1));
        }
    }

    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}