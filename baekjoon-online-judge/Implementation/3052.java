import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int temp = 0;
    int[] result = new int[10];
    for (int i = 0; i < 10; i++) {
      temp = scanner.nextInt();
      result[i] = temp % 42;
    }

    for (int j = 0; j < result.length; j++) {
      for (int k = j + 1; k < result.length; k++) {
        if (result[j] == -1) {
          break;
        }
        else if (result[j] == result[k]) {
          result[k] = -1;
        }
      }
    }

    int cnt = 0;
    for (int l = 0; l < result.length; l++) {
      if (result[l] != -1) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}