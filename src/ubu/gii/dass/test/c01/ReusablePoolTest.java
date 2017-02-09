/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
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

		assertEquals("Test Singleton", rp1, rp2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		ReusablePool rp = ReusablePool.getInstance();
		boolean flag = true;
		while (flag) {
			try {
				assertTrue("Comprobamos que devuelva una instancia de Reusable.",
						rp.acquireReusable() instanceof Reusable);
			} catch (NotFreeInstanceException e) {
				flag = false;
			}
		}
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
