package studio7;

public class Die {
	private int sides;
	//constructor
	public Die (int sides) {
		this.sides=sides;
	}
	public int getsides() {
		return this.sides;
	}
	public void setsides(int newsides) {
		this.sides = newsides;
	}
	public int roll() {
		return (int) (Math.random()*this.sides + 1);
	}
public static void main (String[] args) {
	Die sixSides = new Die(6);
	System.out.println(sixSides.roll());
}
}