package testCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Rfile  { 
	
    @Test
    public void addition () {
    	
    	System.out.println("adding test");
    	Calculator calculator =new Calculator();
    	assertEquals(2, calculator.add(1,1) );
    }
}