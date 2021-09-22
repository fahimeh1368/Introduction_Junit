package io.javabrain;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
	}
	@Test
	 public void formatsPlainText() {
	        assertEquals("plain text", Pattern.formatText("plain text"));
	    }
	
	@Test
    public void removesTextBetweenAngleBracketPairs() {
        assertEquals("", Pattern.formatText("<>")); 
    }
	@Test
    public void xx() {
        assertEquals("", Pattern.formatText("<test123478>")); 
    }
	@Test
    public void xxx() {
        assertEquals("78", Pattern.formatText("<test/123478>")); 
    }
}
