import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
    	int a = m%10;
    	int b = a%5;
        
        
        return m/10 + a/5 + a%5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}

