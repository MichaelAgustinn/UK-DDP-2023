import java.util.Scanner;

public class Nomor3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();

    if (a % 2 == 0) {
      System.out.println("Genap = " + (a + b) + " (Hasil Dari Penjumlahan " + a + "+" + b + ")");
    } else {
      System.out.println("Ganjil = " + (a + b) + " (Hasil Dari Penjumlahan " + a + "+" + b + ")");

    }

  }
}
