
public class App {

	public static void main(String[] args) {
		
Shape[] rectangles = new Shape[5];
		
		int widthMultiplier = 10;
		
		for (int i=0; i<rectangles.length; i++) {
			
			rectangles[i] = new Shape();
			rectangles[i].setLength(3);
			rectangles[i].setWidth((i+1) * widthMultiplier);
			
			System.out.println("Area of Rectangle = " + rectangles[i].calcAreaRectangle());
			
		}
		
		Shape[] circles = new Shape[5];
		
		int radius = 1;
		
		for(int j=0; j<circles.length; j++) {
			circles[j] = new Shape();
			circles[j].setRadius((j+1) * radius);
			
			System.out.println("Area of Circle = " + circles[j].calcAreaCircle());
		}
	}

}
