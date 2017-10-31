package ma223zf_assign2;

import java.awt.Color;

public class Rectangle {
	private int xPos = 0;
	private int yPos = 0;
	private int width;
	private int height;
	private Color color = Color.WHITE;
	
	public Rectangle(int w,int h) {
		setWidth(w);
		setHeight(h);
	}
	
	public Rectangle(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		color = c;
	}
	
	/* Mainly for Diagnostic Purposes */
	public String toString() {
		String str = "X = "+xPos+", Y = "+yPos;
		str += ", Width = "+width+", Height = "+height;
		str += ", Color = "+color.toString();
		return str;
	}
	
	/* Mutators */
	public void setX(int x) { 
		if ( checkPositive(x,"x-value") )
			xPos = x; 
	}
	public void setY(int y) { 
		if ( checkPositive(y,"y-value") )
			yPos = y;
	}
	private void setWidth(int w) {     // Private since Width constant 
		if ( checkPositive(w,"width") )
			width = w; 
	}
	private void setHeight(int h) {     // Private since Height constant 
		if ( checkPositive(h,"height") )
			height = h; 
	}
	public void setColor(Color c) { color = c; }
	public void move(int dx, int dy) {
		setX(xPos+dx);
		setY(yPos+dy);
	}
	public void movetoXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	/* Accesor Methods */
	public int getX() { return xPos; }
	public int getY() { return yPos; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public Color getColor() { return color; }
	
	
    /* Rectangles A, B do not overlap if:
     *    -  A is completely above or below B, or
     *    -  A is completely to the left or right of B
     * A above B ==> A.Y > B.Y+B.HEIGHT, A below B ==> A.Y+A.HEIGHT < B.Y
     * A right of B ==> A.X > B.X+B.WIDTH, A left of B ==> A.X+A.WIDTH < B.X               
     */
  public boolean isOverlapping(Rectangle r) {
     boolean thisAboveBelowR =   yPos>r.yPos+r.height || yPos+height < r.yPos;
     boolean thisRightLeftR = xPos>r.xPos+r.width || xPos+width<r.xPos;
     
     boolean notOverlapping = thisAboveBelowR || thisRightLeftR;
     return !notOverlapping;
  }   
	
	
	/* Area and Perimeter */
	public int getArea() { return width*height; }
	public int getPerimeter() { return 2*width+2*height; }
	
	
	/* Private Help Methods */
	private boolean checkPositive(int n, String entity) {
		if (n<0) {
			String msg = "Invalid "+entity+" value: "+n;
			System.err.println(msg);
			return false;
		}
		return true;
	}
	
	
}
