import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[] results = new int[n];
    
    int a, b;
    for (int i = 0; i < n; i++) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      results[i] = a + b;
    }

    for (int j = 0; j < n; j++) {
      System.out.println(results[j]);
    }
  }
}