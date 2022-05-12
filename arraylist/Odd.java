package arraylist;

import java.util.ArrayList;

public class Odd {
	/**
	 * Return all odd numbers less than n
	 * 
	 * @param n
	 * @return An array list of positive odds, less than n [1,3,5,7,...]
	 */
	public static ArrayList<Integer> odds(int n) {
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				oddNumbers.add(i);
			}
		}

		return oddNumbers;
	}

	public static void main(String[] args) {
		// Print out all odd numbers less than 100
        ArrayList<Integer> odds_less_than_30;
        odds_less_than_30 = odds(30);
        System.out.println(odds_less_than_30);

	}
}
