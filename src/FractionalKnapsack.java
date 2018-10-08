import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
	
	public static class Container {
        int v;
        int w;
        Container(int v, int w) {
            this.v = v;
            this.w = w;
        }
        int getV() {
            return v;
        }
        int getW() {
            return w;
        }
	}

        private static double getOptimalValue(int capacity, int[] values, int[] weights)  {
        double value = 0;
        ArrayList<Container> A = new ArrayList<Container>();
        for (int i = 0; i < values.length; i++) {
            A.add(new Container(values[i], weights[i]));
        }
        Collections.sort(A,new Comparator<Container>() {
            @Override
            public int compare(Container c1, Container c2) {
                Double d1 = c1.v / (double)c1.w;
                Double d2 = c2.v / (double)c2.w;
                return d2.compareTo(d1);
            }
        });

        for (int i = 0; i < A.size(); i++) {
            double weight = Math.min(capacity, ((Container)A.get(i)).getW());
            value += weight * (((Container)A.get(i)).getV() / (double)((Container)A.get(i)).getW());
            capacity -= weight;
            if (capacity == 0) {
                return value;
            }
        }
        return value;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
