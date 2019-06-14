package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	@Before
	public void before() {
		
	}
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2positions() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_withnoA(){
		assertEquals("CD", helper.truncateAInFirst2Positions("CDEF"));
		
	}
	// ABCD => false  ABAB=> true AB => true A=>false
	@Test
	public void testAreFirstAndLastCharactersSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse("The condition fails", true);
		assertFalse(true);
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame2() {
	assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	assertTrue("The condition fails", true);
	
	}
}
