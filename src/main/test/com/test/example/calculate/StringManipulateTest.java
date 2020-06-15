package com.test.example.calculate;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author qyu1
 *
 */
@RunWith(Parameterized.class)
public class StringManipulateTest {
	
	private String id;
	private String inputString;
	private String result;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"id0", 
            	"", 
            	""}, 
            {"id1",
            	"",
            	""}
        });
    }
    
    public StringManipulateTest(String id, String inputString, String result) {
    	this.id = id;
    	this.inputString = inputString;
    	this.result = result;
    }

	/**
	 * 
	 */
	@Test
	public void testMethod1() {
		System.out.println("########### " + id + " ###########");
		StringManipulate sm = new StringManipulate();
		sm.setInputString(inputString);
		assertTrue(sm.method1().equals(result));
	}

}
