package ma223zf_assign2;

import java.util.Scanner;

public class LargestK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // create an object of scanner//
		System.out.print("insert a possitive integer: ");
		int num = scan.nextInt();
		int sum = 0;
		int k = 0;
		while (sum + (k + 2) < num) {

			k = k + 2;
			sum = sum + k;
		}
		System.out.println("largest k:" + k + "    0+2+4+6+...+" + k + "<" + num);
		scan.close();
	}

}
