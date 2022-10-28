package ICA8_Testing_rpatil29.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ICA8_Testing_rpatil29.src.Urinals;

class test {

	@Test
	void testGoodString() {
		System.out.println("+++++++++ Rushikesh Patil == Test Cases Below ++++++++++++++++");
		assertEquals(2, Urinals.goodString("000"));
		
		assertEquals(1, Urinals.goodString("10001"));
		
		assertAll(() -> assertEquals(3, Urinals.goodString("00000")));
		
		assertEquals(2, Urinals.goodString("101")); // Failure
		
		assertEquals(-1, Urinals.goodString("1"));
		
		assertEquals(-1, Urinals.goodString("0")); //Failure
	}

}
