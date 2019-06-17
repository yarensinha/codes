package com.saket.junit.assertthat;
 
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
 
public class JUnitTestAssertThatAssertions {
     
    int totalNumberOfApplicants = 0;
     
    @Before
    public void setData(){
        this.totalNumberOfApplicants = 9;
    }
     
    @Test
    public void testAssertThatEqual() {
        assertThat("123",is("123"));
    }
     
    @Test
    public void testAssertThatNotEqual() {
        assertThat(totalNumberOfApplicants,is(123));
    }
     
    @Test
    public void testAssertThatObject() {
        assertThat("123",isA(String.class));
    }
     
    @Test
    public void testAssertThatWMessage(){
        assertThat("They are not equal!","123",is("1234"));
    }
}