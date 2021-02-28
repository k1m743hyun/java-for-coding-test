import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String temp = scanner.nextLine();
    int n = Integer.parseInt(temp);
    double[] res = new double[n];
    for (int i = 0; i < n; i++) {
      temp = scanner.nextLine();
      String[] tempArr = temp.split(" ");
      int total = Integer.parseInt(tempArr[0]);
      int[] scores = new int[total];
      int sum = 0;
      for (int j = 0; j < total; j++) {
        scores[j] = Integer.parseInt(tempArr[j + 1]);
        sum += scores[j];
      }
      double avg = (double)sum / (double)total;
      int cnt = 0;
      for (int k = 0; k < total; k++) {
        if ((double)scores[k] > avg) {
          cnt++;
        }
      }
      res[i] = (double)cnt / (double)total * 100.0;
    }
    for (int l = 0; l < n; l++) {
      System.out.printf("%.3f%%\n", res[l]);
    }
  }
}