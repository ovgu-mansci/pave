package ovgu.pave.core.algorithm.lns.removal;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RemovalMethodsTest extends TestCase {

	public RemovalMethodsTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RemovalMethodsTest.class);
	}

	public void testRemovalMethods() {
		calculateNumberOfRequestsToBeRemovedTest();
	}

	
	private void calculateNumberOfRequestsToBeRemovedTest() {
		assertTrue(RemovalMethods.calculateNumberOfRequestsToBeRemoved(2) >= 0);
		
		
	}
}
