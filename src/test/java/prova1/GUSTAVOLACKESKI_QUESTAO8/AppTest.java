package prova1.GUSTAVOLACKESKI_QUESTAO8;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   /* public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    /*public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
	Usuario u1,u2,u3;
	Biblioteca b1;
    public void testSprint1()
    {
    	u1 = new Usuario("Paulo");
    	u2 = new Usuario("Maria");
    	u3 = new Usuario("Joao");
    	b1 = new Biblioteca();
    	b1.addUser(u1);
    	assertTrue(b1.containUser(u1));
    	b1.blockUser(u1);
    	assertTrue(b1.isBlocked(u1));
    	b1.removeUser(u1);
    	assertFalse(b1.containUser(u1));
    }
}
