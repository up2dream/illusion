package illusion.base;

public class Point3DF extends HPointF {

	// ===========================================================
	// Constants
	// ===========================================================

	public final static Point3DF ORIGIN = new Point3DF(0, 0, 0);
	
	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public Point3DF() {
		tuple[3] = 1f;
	}
	
	public Point3DF(float x, float y, float z) {
		super(x, y, z, 1f);
	}
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * affine sum
	 * @param pt
	 * @return
	 */
	public Point3DF plus(Point3DF pt) {
		return this;
	}
	
	/**
	 * affine minus
	 * @param pt
	 * @return
	 */
	public Point3DF minus(Point3DF pt) {
		return this;
	}
	
	public Point3DF multiply(float scalar) {
		return this;
	}
	
	public Point3DF divide(float scalar) {
		return this;
	}
	
	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
