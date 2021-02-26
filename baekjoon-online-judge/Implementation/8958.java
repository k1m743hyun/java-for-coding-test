import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      int res = 0;
      int continuous = 0;
      String answer = scanner.next();
      String[] ans = answer.split("");
      for (int j = 0; j < ans.length; j++) {
        if (ans[j].equals("O")) {
          continuous += 1;
        }
        else {
          continuous = 0;
        }
        res += continuous;
      }
      System.out.println(res);
    }
  }
}