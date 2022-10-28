package ICA8_Testing_rpatil29.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ICA8_Testing_rpatil29.src.Urinals;

class test {

	@Test
	void testGoodString() {
		System.out.println("+++++++++ Rushikesh Patil == Test Cases Below ++++++++++++++++");
		assertEquals(2, Urinals.goodString("000"));
	}

}
