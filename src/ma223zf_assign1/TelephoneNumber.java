package ma223zf_assign1;

import java.util.Random;

public class TelephoneNumber {

	public static void main(String[] args) {
		Random rand=new Random();//create a random object//
		int a=0;
		int x1=rand.nextInt(10);
		int x2=rand.nextInt(10);
		int x3=rand.nextInt(10);
		int z=1+rand.nextInt(9);
		int y1=rand.nextInt(10);
		int y2=rand.nextInt(10);
		int y3=rand.nextInt(10);
		int y4=rand.nextInt(10);
		int y5=rand.nextInt(10);
		System.out.println("telephone number generator: "+a+x1+x2+x3+"-"+z+y1+y2+y3+y4+y5);//generate telephone//
	

	}

}
