public class CheckTriangle extends CheckFigure {
	//-----------------------------------------------------------------------------
	private static final double STRAIGHTANGLE = 180.0;
	private static final double RIGHTANGLE = 90.0;
	//-----------------------------------------------------------------------------

	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isTriangleCheckAngles(Double angle1, Double angle2, Double angle3)
	{
		Double sum = (angle1 + angle2 + angle3);
		return ((sum.compareTo(CheckTriangle.STRAIGHTANGLE)) == 0);
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isTriangleCheckSides(Double side1, Double side2, Double side3)
	{
		return ((side1.compareTo(side2 + side3) > 0) &&
				(side2.compareTo(side1 + side3) > 0) &&
				(side3.compareTo(side1 + side2) > 0));
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isRightangled(Double angle1, Double angle2, Double angle3)
	{
		return ((angle1.compareTo(CheckTriangle.RIGHTANGLE) == 0) ||
				(angle2.compareTo(CheckTriangle.RIGHTANGLE) == 0) ||
				(angle3.compareTo(CheckTriangle.RIGHTANGLE) == 0));
	}
	//One angle 90*
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isAcuted(Double angle1, Double angle2, Double angle3)
	{
		return ((angle1.compareTo(CheckTriangle.RIGHTANGLE) < 0) &&
				(angle2.compareTo(CheckTriangle.RIGHTANGLE) < 0) &&
				(angle3.compareTo(CheckTriangle.RIGHTANGLE) < 0));
	}
	//All angles <90*
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isObtused(Double angle1, Double angle2, Double angle3)
	{
		return ((angle1.compareTo(CheckTriangle.RIGHTANGLE) > 0) ||
				(angle2.compareTo(CheckTriangle.RIGHTANGLE) > 0) ||
				(angle3.compareTo(CheckTriangle.RIGHTANGLE) > 0));
	}
	//One angle >90*
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isScalenous(Double side1, Double side2, Double side3)
	{
		return ((side1.compareTo(side2) != 0) &&
				(side2.compareTo(side3) != 0) &&
				(side3.compareTo(side1) != 0));
	}
	//All sides have different length
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isIsoscales(Double side1, Double side2, Double side3)
	{
		return ((side1.compareTo(side2) == 0 && side1.compareTo(side3) != 0) ||
				(side2.compareTo(side3) == 0 && side2.compareTo(side1) != 0) ||
				(side3.compareTo(side1) == 0 && side3.compareTo(side2) != 0));
	}
	//Two sides have the same length, but third side has another
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public static boolean isEquilateral(Double side1, Double side2, Double side3)
	{
		return ((side1.compareTo(side2) == 0) && (side1.compareTo(side3) == 0));
	}
	//All sides have the same length
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
}
