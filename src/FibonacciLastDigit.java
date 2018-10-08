
import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;
        else {
        	int array[] = new int[n+1];
        	array[0]= 0;
        	array[1]= 1;
        	for(int i=2; i<=n; i++) {
        		array[i] = (array[i-1] + array[i-2])%10;
        	}
        	return array[n];
        	}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

