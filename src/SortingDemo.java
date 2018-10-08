import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {
	public static void main(String[] args) {
		Date[] dates = { new Date(4, 12), new Date(7, 4), new Date(12, 30), new Date(4, 8), new Date(3, 4),
				new Date(8, 31), new Date(2, 4) };
 
		Comparator<Date> dateComparator = new Comparator<Date>() {
			public int compare(Date d1, Date d2) {
				if (d1.getMonth() < d2.getMonth()) {
					// d1 before d2
					return -1;
				} else if (d1.getMonth() == d2.getMonth()) {
					if (d1.getDay() < d2.getDay()) {
						return -1;
					} else if (d1.getDay() == d2.getDay()) {
						return 0;
					} else {
						return 1;
					}
				} else {
					// d1 after d2
					return 1;
				}
			}
		};
		
		System.out.println(Arrays.toString(dates));
		Arrays.sort(dates, dateComparator);
		System.out.println(Arrays.toString(dates));
	}
}

class Date {
	private int month;
	private int day;

	public Date(int month, int day) {
		this.month = month;
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String toString() {
		return month + "/" + day;
	}
}