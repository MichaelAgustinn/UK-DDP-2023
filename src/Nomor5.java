import java.util.ArrayList;
import java.util.Scanner;

public class Nomor5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();
    int b = 0, i = 0;
    while (true) {
      a.add(in.nextInt());
      int temp = b;
      b += a.get(i);
      if (i != 0)
        System.out.println(b + " (" + a.get(i) + " tambah " + temp + ")");
      i++;
      temp = 0;
    }

  }
}
