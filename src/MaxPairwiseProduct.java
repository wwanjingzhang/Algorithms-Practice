
import java.util.*;
import java.io.*;
import java.util.Random;

public class MaxPairwiseProduct {

	static Long getMaxPairwiseProduct(int[] numbers) {
		long product = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				product = Math.max(product, (long)numbers[i] * (long) numbers[j]);
			}
		}
		return (long) product;
	}

	static Long getMaxPairwiseProductFast(int[] numbers) {
		int n = numbers.length;
		int maxIndex1 = -1;
		for (int i = 0; i < n; i++) {
			if ((maxIndex1 == -1) || (numbers[i] > numbers[maxIndex1]))
				maxIndex1 = i;
		}
		int maxIndex2 = -1;
		for (int j = 0; j < n; j++) {
			if ((j != maxIndex1) && ((maxIndex2 == -1) || (numbers[j] > numbers[maxIndex2])))
				maxIndex2 = j;
		}
		Long numbers1 = (long) numbers[maxIndex1];
		Long numbers2 = (long) numbers[maxIndex2];
		return numbers1 * numbers2;
	}

	public static void main(String[] args) {
		/*
		 * while(true) { int n= (int) (Math.random()*10+2); //a random number between 2
		 * and 11 System.out.println(n); int[] a = new int[n]; for(int i = 0;i < n;i++)
		 * { a[i]= (int) (Math.random()*10000); } for (int i=0;i < n;i++) {
		 * System.out.print(a[i]+" "); } System.out.print("\n"); long res1 =
		 * getMaxPairwiseProduct(a); long res2 = getMaxPairwiseProductFast(a);
		 * if(res1!=res2) { System.out.println("Wrong answer: " + res1 + " " + res2);
		 * break; } else { System.out.println("Ok"); } }
		 */

		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println((long)getMaxPairwiseProductFast(numbers));

	}
}

class FastScanner {
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
