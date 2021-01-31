import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int M = scanner.nextInt();

    if (M < 45) {
      if (H == 0) {
        System.out.printf("%d %d\n", 23, M + 15);
      }

      else {
        System.out.printf("%d %d\n", H - 1, M + 15);
      }
    }

    else {
      System.out.printf("%d %d\n", H, M - 45);
    }
  }
}