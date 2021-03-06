package illusion.base;

/**
 * @author HuBin1
 * Homogeneous Point
 */
public class HPointF {
	
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	protected float tuple[] = new float[4];
	
	// ===========================================================
	// Constructors
	// ===========================================================

	public HPointF() {
	}
	
	public HPointF(float x, float y, float z, float w) {
		
		tuple[0] = x;
		tuple[1] = y;
		tuple[2] = z;
		tuple[3] = w;
	}
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public float x() {
		return tuple[0];
	}
	
	public void x(int x) {
		tuple[0] = x;
	}
	
	public float y() {
		return tuple[1];
	}
	
	public void y(int y) {
		tuple[1] = y;
	}
	
	public float z() {
		return tuple[2];
	}
	
	public void z(int z) {
		tuple[2] = z;
	}
	
	public float w() {
		return tuple[3];
	}
	
	public void w(int w) {
		tuple[3] = w;
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public boolean equals(Object val) {
		if (val == null) {
			return false;
		}
		
		if (!(val instanceof HPointF)) {
			return false;
		}
		
		HPointF valPt = (HPointF)val;
		return tuple[0]==valPt.tuple[0] && tuple[1]==valPt.tuple[1] && tuple[2]==valPt.tuple[2] && tuple[3]==valPt.tuple[3];
	}
	
	public boolean equalWith(HPointF val) {
		return equals(val);
	}
	
	public boolean notEqualWith(HPointF val) {
		return false;
	}
	
	public boolean greaterThan(HPointF val) {
		return false;
	}
	
	public boolean greaterOrEqualThan(HPointF val) {
		return false;
	}
	
	public boolean lessThan(HPointF val) {
		return false;
	}
	
	public boolean lessOrEqualThan(HPointF val) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return Float.valueOf(tuple[0]).hashCode() ^ Float.valueOf(tuple[1]).hashCode() ^ Float.valueOf(tuple[2]).hashCode() ^ Float.valueOf(tuple[3]).hashCode();
	}
	
	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
