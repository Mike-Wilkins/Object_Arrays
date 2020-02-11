

public class Shape {
	
public double length, width, radius;
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calcAreaRectangle() {
		double area = getLength() * getWidth();
		return area;
	}
	
	public double calcAreaCircle() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
}
