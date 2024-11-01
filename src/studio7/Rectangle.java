package studio7;

public class Rectangle {
private double length; //instance variables
private double width;

public Rectangle(double length, double width) { //constructor
	this.length = length;
	this.width = width;
}

//getter (length)
public double getLength() {
	return this.length;
}

//getter (width)
public double getWidth() {
	return this.width;
}

//setter
public void setLength(double newLength) {
	this.length = newLength;
}
//setter
public void setWidth(double newWidth) {
	this.length = newWidth;
}

//area
public double area() {
	return this.length * this.width;
}

//perimeter
public double perimeter() {
	return this.length * 2 + this.length * 2;
}

public boolean square() {
	if (this.length == this.width) {
		return true;
	} else {
		return false;
	}
}

public boolean isSmaller(Rectangle r2) {
	if (this.area() < r2.area()) {
		return true;
	} else {
		return false;
	}
}

public String toString() {
	return "Rectangle Length: " + this.length + " Rectangle Width: " + this.width;
}

public static void main(String[] args) {
	Rectangle r = new Rectangle(6,3);
	Rectangle r2 = new Rectangle(4,2);
	System.out.println(r);
	System.out.println(r.area());
	System.out.println(r.perimeter());
	System.out.println(r.square());
	System.out.println(r.isSmaller(r2));
}

}
