import java.util.Scanner;

public class Nomor6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = a * b;
    int d = 0;
    if ((c % 2) == 0 && (c - 3) != 0) {
      d = c * 2;
    } else {
      d = c + 2;
    }

    System.out.println(d);
  }

}
