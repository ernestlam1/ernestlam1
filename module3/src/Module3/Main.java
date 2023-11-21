package Module3;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
     public static HashMap<Integer, Integer> fib = new HashMap<>();

    public static int fibonacci(int n) {
        if(n<=1){
            //Compute the first two terms f0=0,f1=1
            return n;
        }
        if (fib.containsKey(n)) {
            return fib.get(n);
        }

        int number = fibonacci(n - 1) + fibonacci(n - 2);
        fib.put(n, number);
        return number;
    }

    public static void main(String[] args) {
        
        while (true) {
            System.out.print("Input: ");
              Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int number = fibonacci(n);
                System.out.println("Output: " + number);
            }
    }
}