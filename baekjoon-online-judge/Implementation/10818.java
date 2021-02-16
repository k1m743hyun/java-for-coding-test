import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int min = 0;
    int max = 0;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      temp = scanner.nextInt();
      if (i == 0) {
        min = temp;
        max = temp;
      }

      else if (temp < min) {
        min = temp;
      }

      else if (temp > max) {
        max = temp;
      }
    }
    System.out.printf("%d %d\n", min, max);
  }
}