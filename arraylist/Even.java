package arraylist;

import java.util.*;

public class Even {
	/**
	 * Return all even numbers less than n
	 * 
	 * @param n
	 * @return An array list of positive evens, less than n [0,2,4,...]
	 */
	public static ArrayList<Integer> evens(int n) {
		ArrayList<Integer> even_nums = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				even_nums.add(i);
			}
		}
		return even_nums;
	}

	public static void main(String[] args) {
		ArrayList<Integer> even_less_than_20;
		even_less_than_20 = evens(20);
		System.out.println(even_less_than_20);
	}
}
