import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah yang ingin dihitung : ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka[i - 1] = sc.nextInt();
        }

        int totalRekursif = jumlahRekursif(angka, N - 1);
        int totalIteratif = jumlahIteratif(angka);

        System.out.println();
        System.out.println("Total dari " + N + "angka (rekursif) adalah :" + totalRekursif);
        System.out.println("Total dari " + N + "angka (iteratif) adalah :" + totalIteratif);

    }
    
    static int jumlahRekursif(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + jumlahRekursif(arr, index - 1);
        }
    }

    static int jumlahIteratif(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    
}
