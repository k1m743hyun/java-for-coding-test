import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    double max = 0;
    double[] li = new double[n];
    for (int i = 0; i < n; i++) {
      li[i] = scanner.nextDouble();
      if (li[i] > max) {
        max = li[i];
      }
    }
    double temp = 0;
    double sum = 0;
    for (int j = 0; j < n; j++) {
      temp = li[j] / max * 100;
      sum += temp;
    }

    System.out.println(sum / n);
  }
}