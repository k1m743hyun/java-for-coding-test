import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[] times = new int[n];
    for (int i = 0; i < n; i++) {
      times[i] = scanner.nextInt();
    }

    int result = 0;
    int temp = 0;

    Arrays.sort(times);

    for (int j = 0; j < n; j++) {
      temp += times[j];
      result += temp;
    }

    System.out.println(result);
  }
}