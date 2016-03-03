package core;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Selenium.
 */
public class SeleniumTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SeleniumTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SeleniumTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSelenium()
    {
        assertTrue( true );
    }
}

