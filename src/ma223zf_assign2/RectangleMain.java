package ma223zf_assign2;

import java.awt.Color;


public class RectangleMain {


	public static void main(String[] args) {
		/* Create two rectangles */
		Rectangle r1 = new Rectangle(100,200,300,400,Color.GRAY);		
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle(500,600);  // Height, Width
		r2.setX(150);
		r2.setY(250);
		r2.setColor(Color.YELLOW);
		System.out.println(r2.toString());
		
		/* Accessor Methods */
		int x = r1.getX();
		int y = r1.getY();
		int h = r1.getHeight();
		int w = r1.getWidth();
		Color c = r1.getColor();
		System.out.println(x+"\t"+y+"\t"+h+"\t"+w+"\t"+c.toString());
		
		/* Area and Perimeter */
		int area = r1.getArea();
		System.out.println("Area = "+area);
		System.out.println("Perimeter = "+r1.getPerimeter());
		
		/* Overlapping */
		if (r1.isOverlapping(r2))
			System.out.println("Rectangles are overlapping");
		
		/* Move and MoveToXY */
		r1.move(50,-50);     // New position (150,150)
		r2.movetoXY(500,600); // New position (500,600)
		if (!r2.isOverlapping(r1))
			System.out.println("Rectangles are not overlapping");
		
		/* Check Encapsulation */
		Rectangle r3 = new Rectangle(100,-50);                      // Negative height   
		Rectangle r4 = new Rectangle(100,-100,300,300,Color.BLUE);  // Negative y
		r3.setX(-200);                                              // Negative x
		System.out.println(r4.toString());
	}

}
