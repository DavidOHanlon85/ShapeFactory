/**
 * 
 */
package slideDeckChallenges;

import java.util.ArrayList;

/**
 * 
 */
public class ShapeFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape tri = new Triangle(3, 5);
		Shape rect = new Rectangle(2, 8);
		Shape circ = new Circle(4.2);
		Shape shape = new Shape();
		
		tri.area();
		rect.area();
		circ.area();
		shape.area();
		
		calculateArea(tri);
		calculateArea(rect);
		calculateArea(circ);
		calculateArea(shape);
		
		Shape[] shapes = new Shape[] {tri, rect, circ, shape};
		
		getAreasOfShapesInArray(shapes);
		
		ArrayList<Shape> shapes2 = new ArrayList<Shape>();
		shapes2.add(tri);
		shapes2.add(rect);
		shapes2.add(circ);
		shapes2.add(shape);
		
		areaOfShapesInAnArrayList(shapes2);
		
		

	}

	/**
	 * This method calculates the area of the shapes in the array list
	 * @param shapes2
	 */
	public static void areaOfShapesInAnArrayList(ArrayList<Shape> shapes2) {
		for (Shape s : shapes2) {
			if (s!=null) {
				s.area();
			}
		}
	}

	/**
	 * This area prints to console the areas of the shapes in the array
	 * @param shapes
	 */
	public static void getAreasOfShapesInArray(Shape[] shapes) {
		for (Shape s : shapes) {
			if(s!=null) {
				s.area();
			}
		}
	}
	
	/**
	 * This method calculates the area of a shape
	 * @param s
	 */
	public static void calculateArea(Shape s) {
		s.area();
	}

}
