package illusion.test;

import illusion.base.Point3D;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author HuBin1
 *
 */
public class TestPoint3D extends Assert {
	
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		
	}
	
	@Test
	public void test_hashCode() {
		Point3D pt = new Point3D(.1f, .2f, .3f);
		pt.hashCode();
	}
	
	@Test
	public void test_equals() {
		{
			Point3D pt1 = new Point3D();
			Point3D pt2 = new Point3D();
			assertEquals(pt1, pt2);
		}
		{
			Point3D pt1 = new Point3D();
			Point3D pt2 = new Point3D(0, 0, 0);
			assertEquals(pt1, pt2);
		}
		{
			Point3D pt1 = new Point3D(.1f, .2f, .3f);
			Point3D pt2 = new Point3D(.1f, .2f, .3f);
			assertEquals(pt1, pt2);
		}
	}
	
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
