import java.util.*;

public class FibonacciHugeAnotherSolution {
	
	public static long getPisanoPeriod(long m) {
		long a = 0;
		long b = 1;
		long c = a+b;
		long count = 1;
		for(int i = 0; i<m*m; i++) {
			c = (a+b)%m;
			a=b;
			b=c;
			if(a==0&&b==1) {
				return count;
		 }
			else {
				count++;
			}
		}
		return 0;	

	}
    private static long getFibonacciSum(long n,long m) {
        long remainder = n%getPisanoPeriod(m);

        long previous = 0;
        long current  = 1;
  
        long res = remainder;
        
        for (long i = 1; i < remainder; ++i) {
        	res = (previous+current)%m;
            previous = current;
            current = res;

        }

        return res%m;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciSum(n, m));
    }
}


