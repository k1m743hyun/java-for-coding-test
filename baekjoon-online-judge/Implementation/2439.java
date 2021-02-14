import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = n - (i + 1); j > 0; j--) {
        System.out.printf(" ");
      }

      for (int k = 0; k < i + 1; k++) {
        System.out.printf("*");
      }

      System.out.printf("\n");
    }
  }
}