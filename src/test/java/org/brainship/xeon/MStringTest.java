package org.brainship.xeon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MStringTest 
{
    @Test
    public void charAtTest()
    {
		MString mstring = new MString("Hello");
		boolean b = (mstring.charAt(0) == 'H');
        assertEquals( true , b );
    }
	
	@Test
	public void arrayTest()
	{
		MString mstring = new MString("Test");
		boolean b = compare(returnWrapperArray(new Character('\n') ,mstring.toCharArray()), returnWrapperArray(new Character('\n') ,"Test".toCharArray()));
		assertEquals( true , b );
	}
	
}
