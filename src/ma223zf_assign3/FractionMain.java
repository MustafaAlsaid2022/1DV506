package ma223zf_assign3;

public class FractionMain {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		f1.setNumerator(1);
		f1.setDenominator(8);

		Fraction f2 = new Fraction(1,4);
		f2.setNumerator(2);
		f2.setDenominator(16);

		System.out.println("The first fraction: " + f1.Tostring());
		System.out.println("The second fraction: " + f2.Tostring());
		System.out.println("The numerator of the first fraction: " + f1.getNumerator());
		System.out.println("The denominator of the first fraction: " + f1.getDenominator());
		System.out.println("The numerator of the second fraction: " + f2.getNumerator());
		System.out.println("The denominator of the second fraction: " + f2.getDenominator());
		if (f1.isNegative()) {
			System.out.println("The fraction is negative");
		}
       if(f1.isEqualTo(f2)){
        	System.out.println("The two fractions are equal");
        }
        else{
        	System.out.println("The two fractions are not equal");
        }
		System.out.println(f1.Tostring() + " + " + f2.Tostring() + " = " + f1.add(f2));
		System.out.println(f1.Tostring() + " - " + f2.Tostring() + " = " + f1.subtract(f2));
		System.out.println(f1.Tostring() + " * " + f2.Tostring() + " = " + f1.multiply(f2));
		System.out.println(f1.Tostring() + " / " + f2.Tostring() + " = " + f1.divide(f2));
		
	}

}
