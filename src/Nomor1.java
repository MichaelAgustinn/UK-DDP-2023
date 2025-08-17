import java.util.Scanner;

public class Nomor1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    if ((a + b) % 2 == 0) {
      System.out.println("Hasil = " + (a + b + 1));
    } else {
      System.out.println("Hasil = " + (a + b + 2));
    }
  }
}
