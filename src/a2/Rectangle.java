package a2;

public class Rectangle {

	// These are the object fields
	// that represent the bottom left and upper right
	// corners of the rectangle and the rectangle's
	// label.
	//
	// Do not change the declaration of these fields.
	// Do not add any additional fields.

	private Point bottom_left;
	private Point upper_right;	
	private String label;
	
	
	// This is the constructor for a Rectangle object.
	// It requires the x and y coordinates of two points
	// for opposite corners of the rectangle. The coordinates
	// as given may or may not be the bottom left and upper right
	// corners (you'll have to check and adjust as necessary). 
	
	// It also takes a String l that should be the rectangle's
	// label.
	// Complete the constructor to initialize
	// the rectangle's fields as appropriate.
	public Rectangle(int x1, int y1, int x2, int y2, String l) {


		
		this.bottom_left = new Point(Math.min(x1, x2), Math.min(y1, y2));
		this.upper_right = new Point(Math.max(x1, x2), Math.max(y1, y2));
		this.label = l;

	}
	
	// This method should return the label
	// for the rectangle.
	public String getLabel() {
		
		return label;
		
	}
	
	// This method should return the x-coordinate of the
	// rectangle's left side.
	public int getLeft() {

		
		return bottom_left.getX();

	}
	
	// This method should return the x-coordinate of the
	// rectangle's right side.
	public int getRight() {

		
		return upper_right.getX();

	}

	// This method should return the y-coordinate of the
	// rectangle's top side.
	public int getTop() {

		
		return upper_right.getY();

	}
	
	// This method should return the y-coordinate of the
	// rectangle's bottom side.
	public int getBottom() {

		
		return bottom_left.getY();

	}
	
	// This method should return the width of the rectangle.
	public int getWidth() {

		
		return getRight()-getLeft();

	}
	
	// This method should return the height of the rectangle.
	public int getHeight() {

		
		return getTop()-getBottom();

	}
	
	// This method should return the area of the rectangle.
	public int getArea() {

		
		return getWidth()*getHeight();
		

	}
	
	// This method should return the perimeter of the rectangle.
	public int getPerimeter() {

		
		return (getWidth()+getHeight())*2;

	}
	
	// This method should return a new Rectangle object
	// that is the same size as the rectangle but
	// translated by dx in the x-direction and dy in
	// the y-direction.
	public Rectangle translate(int dx, int dy) {

		
		/*translate*/
		int rec2_x1=getLeft()+dx;
		int rec2_x2=getRight()+dx;
		int rec2_y1=getBottom()+dy;
		int rec2_y2=getTop()+dy;
		Rectangle rec2=new Rectangle(rec2_x1,rec2_y1,rec2_x2,rec2_y2,this.getLabel());//new rectangle
		return rec2;
	}
	
	
	// This method should test the given Point p
	// for being inside the rectangle. Note that
	// a point on the edge of a rectangle is NOT inside.
	public boolean testPoint(Point p) {

		
		if (p.getX() > getLeft() && p.getX() < getRight()
				&& p.getY() > getBottom() && p.getY() < getTop()) {
			return true;// inside the rectangle, return true
		} else return false;

	}
	
	
	// This method should test the given Rectangle r
	// for having the same geometry (i.e., same 
	// coordinates for top/bottom/left/right).
	public boolean equals(Rectangle r) {

		
		if (this.getLeft() == r.getLeft() && this.getRight() == r.getRight()
				&& this.getBottom() == r.getBottom()
				&& this.getTop() == r.getTop()) {//same coordinates for top/bottom/left/right
			return true;
		}
		else return false;
		

	}
	
	// This method should test the given Rectangle r
	// for intersection with the rectangle. 
	public boolean intersects(Rectangle r) {

		
		if (r.getLeft() >= this.getRight() || r.getRight() <= this.getLeft()
				|| r.getBottom() >=this.getTop()
				|| r.getTop() <= this.getBottom()) {//disjoint situations
			return false;//not intersect return false
		}
		else return true;

	}
	
	// This method should test whether the 
	// rectangle is taller than it is wide.
	public boolean isTall() {

		
		if(getHeight()>getWidth()){
			return true;
		}
		else return false;

	}
	
	// This method should test whether the
	// rectangle is wider than it is tall.
	public boolean isWide() {

		
		if(getWidth()>getHeight()){
			return true;
		}
		return false;

	}
	
	// This method should test whether the
	// rectangle is a square.
	public boolean isSquare() {

		
		if(getWidth()==getHeight()){
			return true;
		}
		else return false;

	}
}

