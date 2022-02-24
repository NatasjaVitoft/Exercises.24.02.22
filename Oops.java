// Task 6

public class Oops {
  public static void main(String[] args) {
    int a = 7, b = 42;
    minimum(a,b);
    if (a == 7) {
      System.out.println(a + " is the smallest!");
    }
  }
  public static void minimum(int a, int b) {
    if (a < b) {
      int smaller = a;
    } else if (a >= b) {
      int smaller = b;
    }
  }
}
