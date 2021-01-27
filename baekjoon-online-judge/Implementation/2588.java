import java.util.Scanner;

class Main {  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    scanner.nextLine();
    int b = scanner.nextInt();
    System.out.printf("%d\n%d\n%d\n%d",a * (b % 10), a * ((b / 10) % 10), a * (b / 100), a * b);
  }
}