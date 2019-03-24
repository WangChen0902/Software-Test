package test;

import org.junit.Test;
import static org.junit.Assert.*;
import src.PrintPrimes;

public class PrimesTest {
	private PrintPrimes primes;
	@Test
	public void testPrimes1() {
		primes = new PrintPrimes();
		assertEquals("2 3 ", primes.printPrimes(2));
	}
	@Test
	public void testPrimes2() {
		primes = new PrintPrimes();
		assertEquals("2 3 5 7 11 ", primes.printPrimes(5));
	}
}
