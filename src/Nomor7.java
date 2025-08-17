import java.text.DecimalFormat;
import java.util.Scanner;

public class Nomor7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(hitungGaji(in.nextInt()));
  }

  public static double hitungGaji(int sks) {
    double potong = 0.0;
    if (sks > 4) {
      potong = sks * 500000 * 0.01;
    }
    if (sks >= 8) {
      potong = 8 * 500000 * 0.01;
      return (8 * 500000) - potong;
    }
    return (sks * 500000);
  }
}
