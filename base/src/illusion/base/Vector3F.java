package illusion.base;

public class Vector3F extends HPointF {

	// ===========================================================
	// Constants
	// ===========================================================

	public final static Vector3F ZERO = new Vector3F(0, 0, 0);
	public final static Vector3F UNIT_X = new Vector3F(1, 0, 0);
	public final static Vector3F UNIT_Y = new Vector3F(0, 1, 0);
	public final static Vector3F UNIT_Z = new Vector3F(0, 0, 1);
	
	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public Vector3F() {
		tuple[3] = 1f;
	}
	
	public Vector3F(float x, float y, float z) {
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
	 * arithmetics minus
	 * @param pt
	 * @return
	 */
	public Vector3F minus(Vector3F vec) {
		return this;
	}
	
	public Vector3F multiply(float scalar) {
		return this;
	}
	
	public Vector3F divide(float scalar) {
		return this;
	}
	
	public float length() {
		return 0;
	}
	
	public float squaredLength() {
		 return 0;
	}
	 
	public Vector3F normalize() {
		return this;
	}

	public Vector3F dot(Vector3F vec) {
		return this;
	}

	public Vector3F cross(Vector3F vec) {
		return this;
	}

	public Vector3F unitCross(Vector3F vec) {
		return this;
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
