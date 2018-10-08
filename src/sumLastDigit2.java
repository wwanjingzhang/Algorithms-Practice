import java.util.Scanner;

public class sumLastDigit2 {
    private static long getFibonacciSum(long n) {
        if (n <= 1)
            return n;
        else {
        long sum = 1;
        long array[] = new long[(int) (n+1)];
    	array[0]= 0;
    	array[1]= 1;
    	for(int i=2; i<=n; i++) {
    		array[i] = (array[i-1] + array[i-2])%10;
    		sum = (sum + array[i])%10;
    	}
        return sum;
      }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }
}

