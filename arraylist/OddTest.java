package arraylist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class OddTest {

	ArrayList<Integer> actual;
	ArrayList<Integer> expected;
	
	@Before 
	public void setup() {
		actual = new ArrayList<Integer>();
		expected = new ArrayList<Integer>();
		
	}
	
	@Test
	public void testOdds() {
		// Add test cases here
		actual = Odd.odds(20);
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);

		assertEquals("odds(20)", expected, actual);
		
	}

	@Test
	public void testOne() {
		actual = Odd.odds(1);
		assertEquals("odds(1) should be empty", expected, actual);
	}
	
	@Test
	public void testMinimalEvenSet() {
		actual = Odd.odds(2);
		expected.add(1);
		assertEquals("odds(2) smallest non-empty even set", expected, actual);
	}

	@Test
	public void testMinimalOddSet() {
		actual = Odd.odds(3);
		expected.add(1);
		assertEquals("evens(3) smallest non-empty even set", expected, actual);
	}
	
	@Test
	public void testGeneralEvenSet() {
		actual = Odd.odds(12);
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		assertEquals("odds(12) more general n", expected, actual);
	}

	@Test
	public void testGeneralOddSet() {
		actual = Odd.odds(13);
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		assertEquals("odds(13) more general n", expected, actual);
	}
}
