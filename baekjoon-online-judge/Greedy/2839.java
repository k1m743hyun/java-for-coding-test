import java.util.Scanner;

class Main {
  public static void calculator(int[] res, int i) {
    res[1] += res[0] / i;
    res[0] = res[0] % i;
  }

  public static void main(String args[]) { 
    Scanner scanner = new Scanner(System.in);
    int[] res = new int[2];
    res[0] = scanner.nextInt();
    res[1] = 0;

    calculator(res, 5);

    if (res[0] == 0) {
      System.out.println(res[1]);
    }

    else {
      if (res[1] > 0 && (res[0] % 3) == 1) {
        res[0] = res[0] + 5;
        res[1] = res[1] - 1;
        calculator(res, 3);
        System.out.println(res[1]);
      }
      
      else if (res[1] > 1 && (res[0] % 3) == 2) {
        res[0] = res[0] + 10;
        res[1] = res[1] - 2;
        calculator(res, 3);
        System.out.println(res[1]);
      }

      else {
        calculator(res, 3);
        if (res[0] == 0) {
          System.out.println(res[1]);
        }

        else {
          System.out.println(-1);
        }
      }
    }
  }
}