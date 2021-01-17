import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    long[] distances = new long[n - 1];
    for (int i = 0; i < n - 1; i++) {
      distances[i] = scanner.nextLong();
    }

    long[] prices = new long[n];
    for (int j = 0; j < n; j++) {
      prices[j] = scanner.nextLong();
    }

    long minPrice = prices[0];
    long res = 0;

    for (int k = 0; k < n - 1; k++) {
      if (minPrice > prices[k]) {
        minPrice = prices[k];
      }
      res += minPrice * distances[k];
    }

    System.out.println(res);
  }
}