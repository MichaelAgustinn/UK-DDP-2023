import java.util.ArrayList;

public class Nomor8 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      a.add(i);
    }
    System.out.println("Index 1 = " + a.get(1) + " Index 7 = " + a.get(7));

    System.out.println(a);
    a.remove(4);
    a.remove(8);
    System.out.println(a);
    a.set(2, 100);
    System.out.println(a);
  }
}
