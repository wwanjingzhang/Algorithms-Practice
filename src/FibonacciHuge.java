import java.util.*;

public class FibonacciHuge {
	
    private static long getFibonacciHuge(long n, long m) {
    	
    	if (n <= 1)
              return n;
        long[] list = new long[(int) (m*m)];
          long count = 1;
          list[0] = 0;
          list[1] = 1;
          for (long i = 2; i < m*m; ++i) {
              list[(int) i] = (list[(int) (i-1)] + list[(int) (i-2)])%m;
              if(list[(int) (i-1)]== 0 && list[(int) i]==1) {
            	  break;
              }
              count++;
          }
          long res = n%count;
          return list[(int) res];
      }
      
      
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

