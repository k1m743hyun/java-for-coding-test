import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();

    int a;
    for (int i = 0; i < n; i++) {
      a = scanner.nextInt();
      if (a < x) {
        System.out.printf("%d ", a);
      }
    }
  }
}