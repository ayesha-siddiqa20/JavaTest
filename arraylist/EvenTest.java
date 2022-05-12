package arraylist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class EvenTest {

	ArrayList<Integer> actual;
	ArrayList<Integer> expected;

	@Before
	public void setup() {
		actual = new ArrayList<Integer>();
		expected = new ArrayList<Integer>();
	}

	@Test
	public void testNegative() {
		actual = Even.evens(-1);
		assertEquals("evens(-1) should be empty", expected, actual);
	}

	@Test
	public void testZero() {
		actual = Even.evens(0);
		assertEquals("evens(0) should be empty", expected, actual);
	}

	@Test
	public void testMinimalOddSet() {
		actual = Even.evens(1);
		expected.add(0);
		assertEquals("evens(1) smallest non-empty odd set", expected, actual);
	}

	@Test
	public void testMinimalEvenSet() {
		actual = Even.evens(2);
		expected.add(0);
		assertEquals("evens(2) smallest non-empty even set", expected, actual);
	}

	@Test
	public void testGeneralOddSet() {
		actual = Even.evens(5);
		expected.add(0);
		expected.add(2);
		expected.add(4);
		assertEquals("evens(5) more general n", expected, actual);
	}

	@Test
	public void testGeneralEvenSet() {
		actual = Even.evens(12);
		expected.add(0);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		expected.add(10);
		assertEquals("evens(12) more general n", expected, actual);
	}

	@Test
	public void testEvens() {
		// Just to see what happens when a test case fails...
		// The test case below is not correct!
		actual = Even.evens(20);

		expected.add(0);
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		expected.add(10);
		expected.add(12);
		expected.add(14);
		expected.add(16);
		expected.add(18);

		assertEquals("evens(20)", expected, actual);
	}

}
