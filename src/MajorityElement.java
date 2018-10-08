

import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
    	int candidate = a[0];
    	int count = 1;
    	for(int i = 0; i<a.length; i++) {
    		if (count<=0) {
    			candidate = a[i];
    		}
    		else {
    			count += (candidate==a[i])?1:-1;
    	 }
    	}
    	
    	int countCheck = 0;
    	for(int i = 0;i<a.length; i++) {
    		if(candidate==a[i]) {
    			countCheck++;
    		}
    	}
    	
    	if(countCheck>right/2)
    		return 1;
    	else 
    		return 0;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
       System.out.println(getMajorityElement(a, 0, a.length)) ;
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

