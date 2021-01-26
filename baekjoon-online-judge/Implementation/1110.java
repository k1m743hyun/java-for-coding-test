import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int cmp = n;

    int count = 0;
    do {
      n = ((n % 10)) * 10 + ((n / 10) + (n % 10)) % 10;
      count++;
    }
    while (n != cmp);

    System.out.println(count);
  }
}