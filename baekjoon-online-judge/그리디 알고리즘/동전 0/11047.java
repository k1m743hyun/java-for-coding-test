import java.util.Scanner;

class Main {  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    
    int[] cash = new int[n];
    for (int i = 0; i < n; i++) {
        cash[i] = scanner.nextInt();
    }
    
    int result = 0;
    for (int j = n - 1; j >= 0; j--) {
        result += k / cash[j];
        k = k % cash[j];
    }
    
    System.out.println(result);
  } 
}