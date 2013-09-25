package illusion.test;

import illusion.base.HPointF;

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
		{
			float x = 0f;
			float y = 0f;
			float z = 0f;
			float w = 0f;
			HPointF pt = new HPointF(x, y, z, w);
			assertEquals(Float.valueOf(x).hashCode()^Float.valueOf(y).hashCode()^Float.valueOf(z).hashCode()^Float.valueOf(w).hashCode(), pt.hashCode());
		}
		{
			float x = .1f;
			float y = .2f;
			float z = .3f;
			float w = .4f;
			HPointF pt = new HPointF(x, y, z, w);
			assertEquals(Float.valueOf(x).hashCode()^Float.valueOf(y).hashCode()^Float.valueOf(z).hashCode()^Float.valueOf(w).hashCode(), pt.hashCode());
		}
	}
	
	@Test
	public void test_equals() {
		{
			HPointF pt1 = new HPointF();
			HPointF pt2 = new HPointF();
			assertEquals(pt1, pt2);
		}
		{
			HPointF pt1 = new HPointF();
			HPointF pt2 = new HPointF(0, 0, 0, 0);
			assertEquals(pt1, pt2);
		}
		{
			HPointF pt1 = new HPointF(.1f, .2f, .3f, .4f);
			HPointF pt2 = new HPointF(.1f, .2f, .3f, .4f);
			assertEquals(pt1, pt2);
		}
		{
			HPointF pt1 = new HPointF(.1f, .2f, .3f, .4f);
			assertFalse(pt1.equals(null));
		}
	}
	
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
