import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    int max = 0;
    int index = 0;
    int temp = 0;
    for (int i = 0; i < 9; i++) {
      temp = scanner.nextInt();

      if (i == 0 || temp > max) {
        max = temp;
        index = i;
      }
    }
    System.out.println(max);
    System.out.println(index + 1);
  }
}