package com.saket.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.saket.junit.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperTestParameterizedTest {
	

	// AACD -> CD
	// ACD -> CD
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperTestParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}



	@Parameters
	public static Collection<String []> testConditions() {
		String expectedOutputs[][]={{"AACD","CD"},
		{"ACD","CD"}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2positions() {
		
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_withnoA(){
		assertEquals("CD", helper.truncateAInFirst2Positions("CDEF"));
		
	}
	
}
