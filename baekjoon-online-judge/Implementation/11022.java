import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int a, b;
    for (int i = 1; i < n + 1; i++) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
    }
  }
}