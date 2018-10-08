import java.util.Scanner;
import java.util.*;

public class fibonacci {
  private static int fib(int n) {
	if(n ==0) {
		return 0;
	}
	else {
	int array[] = new int[n+1];
	array[0]= 0;
	array[1]= 1;
	for(int i=2; i<=n; i++) {
		array[i] = array[i-1] + array[i-2];
	}
	return array[n];
	}
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(fib(n));
  }
}
