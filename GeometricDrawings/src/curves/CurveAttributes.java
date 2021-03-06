package curves;

public class CurveAttributes {
		
	private String pathColor = "#0000FF"; 
	private String pointColor = "#FF0000";
	private boolean drawPoints = true;
	//private boolean isDotted = false;
	
	private float strokeWidthOfPath = 2;
	private float radiusOfPoints = 2;
	
	public String getPathColor() {
		return pathColor;
	}

	public void setPathColor(String pathColor) {
		this.pathColor = pathColor;
	}

	public String getPointColor() {
		return pointColor;
	}

	public void setPointColor(String pointColor) {
		this.pointColor = pointColor;
	}

	public float getStrokeWidthOfPath() {
		return strokeWidthOfPath;
	}

	public void setStrokeWidthOfPath(float strokeWidthOfPath) {
		this.strokeWidthOfPath = strokeWidthOfPath;
	}

	public float getRadiusOfPoints() {
		return radiusOfPoints;
	}

	public void setRadiusOfPoints(float radiusOfPoints) {
		this.radiusOfPoints = radiusOfPoints;
	}

	public void setDrawPoints(boolean drawPoints) {
		this.drawPoints = drawPoints;
	}

	public boolean isDrawPoints() {
		return drawPoints;
	}

	/*public void setDotted(boolean isDotted) {
		this.isDotted = isDotted;
	}

	public boolean isDotted() {
		return isDotted;
	}*/
}
