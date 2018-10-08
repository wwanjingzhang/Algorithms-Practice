import java.util.*;

public class LCM {
  private static long gcd(long a, long b) {
		  if(b==0)
			  return a;
		  a = a % b;
		  return gcd(b, a);
		}	
  private static long lcm(long a, long b) {
	  
	  return (a*b)/gcd(b, a);
	  
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a,b));
  }
}
