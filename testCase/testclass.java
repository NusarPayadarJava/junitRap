package testCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class testclass  { 
	
    @Test
    public void addition () {
    	
    	System.out.println("adding test");
    	Calculator calculator =new Calculator();
    	assertEquals(2, calculator.add(1,1) );
    }
    @Test
     public void additionButFails () {
    	
    	System.out.println("adding faililng test");
    	Calculator calculator =new Calculator();
    	assertEquals(2, calculator.add(1,1) );
    }
}

@Test
void standardAssertions() {
    assertEquals(2, calculator.add(1, 1));
    assertEquals(4, calculator.multiply(2, 2),
            "The optional failure message is now the last parameter");
    assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
            + "to avoid constructing complex messages unnecessarily.");
}