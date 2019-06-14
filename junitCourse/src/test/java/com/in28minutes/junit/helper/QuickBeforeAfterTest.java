package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	// before and after annotation
	
	// Use before class mostly for db connection
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	
	
	@Before
	public void setup() {
		System.out.println("Before test");
	}
	@Test
	public void test() {
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 executed");
	}
	
	@After
	public void tearDown() {
		System.out.println("After Test");
	}
	

}
