/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.ReusablePool;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool rp1 = ReusablePool.getInstance();
		ReusablePool rp2 = ReusablePool.getInstance();

		assertEquals(rp1, rp2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}
	 * .
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
