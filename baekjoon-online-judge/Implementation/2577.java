import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    String strNum = Integer.toString(a * b * c);
    String[] strArr = strNum.split("");
    for (int i = 0; i < 10; i++) {
      int count = 0;
      for (int j = 0; j < strArr.length; j++) {
        if (Integer.parseInt(strArr[j]) == i) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}