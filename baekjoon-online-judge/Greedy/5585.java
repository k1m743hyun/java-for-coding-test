import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = 1000 - scanner.nextInt();

    int[] cashes = {500, 100, 50, 10, 5, 1};

    int count = 0;
    for (int i = 0; i < cashes.length; i++) {
      count += n / cashes[i];
      n = n % cashes[i];
    }

    System.out.println(count);
  }
}