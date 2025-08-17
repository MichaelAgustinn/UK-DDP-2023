import java.util.Scanner;

public class Nomor2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    for (int i = 1; i <= a; i++) {
      System.out.println();
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
    }
  }
}
