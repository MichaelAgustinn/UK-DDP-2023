import java.util.Scanner;

public class Nomor4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    if (a == 2) {
      System.out.println("kosong");
    }
    for (int i = 1; i <= a; i++) {
      if (i % 3 == 0) {
        if (i != 3) {
          System.out.print(",");
        }
        System.out.print(i);
      }
    }
  }
}
