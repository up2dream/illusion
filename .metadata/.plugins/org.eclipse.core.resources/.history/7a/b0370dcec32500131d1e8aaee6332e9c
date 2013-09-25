package illusion.base;

/**
 * @author HuBin1
 *
 */
public class Point3D {
	
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public float mX;
	public float mY;
	public float mZ;
	
	// ===========================================================
	// Constructors
	// ===========================================================

	public Point3D() {
		
	}
	
	public Point3D(float x, float y, float z) {
		mX = x;
		mY = y;
		mZ = z;
	}
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public boolean equals(Object val) {
		if (val == null) {
			return false;
		}
		
		if (!(val instanceof Point3D)) {
			return false;
		}
		
		Point3D valPt = (Point3D)val;
		return mX==valPt.mX && mY==valPt.mY && mZ==valPt.mZ;
	}
	
	@Override
	public int hashCode() {
		return Float.valueOf(mX).hashCode() ^ Float.valueOf(mY).hashCode() ^ Float.valueOf(mZ).hashCode();
	}
	
	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
