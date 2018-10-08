import java.util.Scanner;

public class FibonacciSumLastDigitNew {
	
    private static long getFibonacciSum(long n) {
    	
    	long zero = 0;
		long one = 1;
		long next;
		long res = 1;
    	
        for (long i = 2; i <= n; ++i) {
        	next = (zero+one)%10;
        	zero = one;
        	one = next;
        	res = res + next;

        }

        return (res%10));
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }
}

