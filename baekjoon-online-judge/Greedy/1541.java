import java.util.Scanner;
import java.util.Arrays;

class Main {  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String[] sArray = scanner.next().split("-");

    int res = 0;
    for (int i = 0; i < sArray.length; i++) {
      int[] nArray = Arrays.stream(sArray[i].split("\\+")).mapToInt(Integer::parseInt).toArray();

      int sum = 0;
      for (int j = 0; j < nArray.length; j++) {
        sum += nArray[j];
      }

      res += (i == 0) ? sum : -sum;
    }
    System.out.println(res);
  }
}