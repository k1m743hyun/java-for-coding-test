import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a, b;
    do {
      a = scanner.nextInt();
      b = scanner.nextInt();

      if (a + b == 0) {
        break;
      }

      System.out.println(a + b);
    } while (true);
  }
}