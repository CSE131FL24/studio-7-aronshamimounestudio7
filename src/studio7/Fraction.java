package studio7;

public class Fraction {
	private double numerator;
	private double denominator;

	public Fraction(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction sumFractions(Fraction b) {
		if (this.denominator == b.denominator) {
			return new Fraction(this.numerator + b.numerator, this.denominator);
		} else {
			double denominatorC = this.denominator * b.denominator;
			double numeratorC = this.numerator * b.denominator;
			double numeratorD = b.numerator * this.denominator;
			return new Fraction(numeratorC + numeratorD, denominatorC);
		}
	}

	public Fraction productFractions(Fraction b) {
		return new Fraction(this.numerator*b.numerator, this.denominator*b.denominator);
	}

	public Fraction reciprocal() {
		return new Fraction(this.denominator,this.numerator);
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public static void main (String[] args) {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,4);
		System.out.println("Fraction A: " + a);
		System.out.println("Fraction B: " + b);
		System.out.println("Fraction A * Fraction B: " + a.productFractions(b));
		System.out.println("Fraction A + Fraction B: " + a.sumFractions(b));
		System.out.println("Reciprocal of Fraction A: " + a.reciprocal());
	}
}