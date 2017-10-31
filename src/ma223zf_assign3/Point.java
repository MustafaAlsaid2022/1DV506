package ma223zf_assign3;



public class Point {
	/*main fields*/
	private int xPos = 0;
	private int yPos = 0;

	
	public Point() {

	}

	public Point(int x, int y) {
		xPos = x;
		yPos = y;

	}

	public String toString() { /*how to show the result*/
		String str = "("+xPos + "," + yPos+")";
		return str;
	}
   public boolean isEqualTo(Point p){ /*check two points are equal */
	   if (xPos==p.xPos && yPos==p.yPos ) {
			return true;
		}
		return false;
   }
	public double distanceTo(Point p) { /*calculate distance*/
		double distance = Math.sqrt((xPos - p.xPos) * (xPos - p.xPos) + (yPos - p.yPos) * (yPos - p.yPos)); // calculate distance//
		return distance;

	}
	public void moveToXY(int x, int y) {/*change the point completely*/
		xPos=x;
		yPos=y;
	}
	public void move(int x, int y) { /*change the point by adding its previous value*/
		xPos+=x;
		yPos+=y;
	}
	}
	
