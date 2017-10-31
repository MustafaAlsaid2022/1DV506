package ma223zf_assign3;

public class Fraction {
	int numerator; 
	int denominator;

	public Fraction(int n, int d) {
		setNumerator(n); /*update numerator and denominator*/
		setDenominator(d);
	}

	public String Tostring() { /*display the fraction in form n/d*/
		String str = numerator + "/" + denominator;
		return str;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int n) {
		numerator = n;
	}

	public void setDenominator(int d) {
		if (check(d)) {

			denominator = d;
		}
	}

	public boolean isNegative() { /*negative fraction*/
		if (numerator > 0 && denominator < 0) {
			return true;
		}
		if (numerator < 0 && denominator > 0) {
			return true;
		}
		return false;
	}

	public String add(Fraction f) { /*add process*/
		int newNumi = (numerator * f.denominator) + (denominator * f.numerator);
		int newDenom = denominator * f.denominator;
		if (check(newDenom)) {
			Fraction newf = new Fraction(newNumi / gcd(newNumi, newDenom), newDenom / gcd(newNumi, newDenom));
			String str = newf.Tostring();
			return str;
		} else {
			return "undefind value";
		}
	}

	public String subtract(Fraction f) { /*subtract process*/
		int newNumi = (numerator * f.denominator) - (denominator * f.numerator);
		int newDenom = denominator * f.denominator;
		if (check(newDenom)) { //check denominator//
			Fraction newf = new Fraction(newNumi / gcd(newNumi, newDenom), newDenom / gcd(newNumi, newDenom)); //simplify//
			String str = newf.Tostring();
			return str;
		} else {
			return "undefind value";
		}
	}

	public String multiply(Fraction f) { /*multiply process*/
		int newNumi = numerator * f.numerator;
		int newDenom = denominator * f.denominator;
		if (check(newDenom)) {
			Fraction newf = new Fraction(newNumi / gcd(newNumi, newDenom), newDenom / gcd(newNumi, newDenom));
			String str = newf.Tostring();
			return str;
		}

		else {
			return "undefind value";
		}
	}

	public String divide(Fraction f) {/*divide process*/

		int newNumi = (numerator * f.denominator);
		int newDenom = (denominator * f.numerator);
		if (check(newDenom)) {
			Fraction newf = new Fraction(newNumi / gcd(newNumi, newDenom), newDenom / gcd(newNumi, newDenom));
			String str = newf.Tostring();

			return str;
		} else {
			return "undefind value";
		}
	}
public boolean isEqualTo( Fraction f){ /* check if two fractions are equal*/
       
	int fn=f.numerator/gcd(f.numerator,f.denominator);
	int n= numerator/gcd(numerator,denominator);
	int fd=f.denominator/gcd(f.numerator,f.denominator);
	int d=denominator/gcd(numerator,denominator);
	if(n==fn &&d==fd){
		return true;
	}
	return false;
}
	private boolean check(int d) { /*check denominator value*/
		if (d == 0) {
			System.err.println("The denominator is has an invalid value");
			return false;
		}
		return true;
	}

	private int gcd(int n, int d) { /*find gcd*/

		int temp;
		while (d != 0) {
			temp = d;
			d = n % d;
			n = temp;
		}
		return n;
	}

}