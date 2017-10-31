package ma223zf_assign1;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("insert the tempreture in fahrenhiet: "); //user instruction//
		float feh=scan.nextFloat();
		float celss=(feh-32)*5/9;
		celss=Math.round(celss*10);
		System.out.println("The tempreture in celsius: "+(celss/10));
		scan.close();
        
	}

}
