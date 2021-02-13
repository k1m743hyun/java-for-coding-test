import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i < n + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.printf("*");
      }
      System.out.printf("\n");
    }
  }
}