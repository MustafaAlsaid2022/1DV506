package ma223zf_assign1;
import java.util.Scanner;
public class Change {
	public static void main (String [] args){
		Scanner scan=new Scanner(System.in); // create object of scanner//
		System.out.println("insert the price: ");//user instruction//
		float price=scan.nextFloat();
		System.out.println("insert the payment: ");
		int payment=scan.nextInt();
		int change=payment-Math.round(price); //calculate change//
		int currency1000=change/1000; //calculate number 1000 currency//
		int curency1000Mod=change%1000; /* the remainder after calculating
		number of 1000 currency*/
		int currency500=curency1000Mod/500; //calculate number of 500 currency//
		int currency500Mod=curency1000Mod%500; /* the remainder after calculating
		number of 1000 and 500 currency*/
		int currency100=currency500Mod/100; //calculate 100 currency//
        int currency100Mod=currency500Mod%100; /*remainder after calculating
        1000,500 and 100 currency*/
        int currency50=currency100Mod/50; //calculate 50 currency//
        int currency50Mod=currency100Mod%50;// the remainder//
        int currency20=currency50Mod/20; //calculate 20 currency//
        int currency20Mod=currency50Mod%20; /* remainder after 1000,500
        100 and 50*/
        int currency10=currency20Mod/10;
        int currency10Mod=currency20Mod%10;
        int currency5=currency10Mod/5;
        int currency5Mod=currency10Mod%5;
        System.out.println("The price: "+ price);
        System.out.println("The payment: "+ payment);
        System.out.println("\nThe change: "+change+" kronor");
		System.out.println("1000kr bills:"+ currency1000);
		System.out.println(" 500kr bills:"+ currency500);
		System.out.println(" 100kr bills:"+ currency100); 
		System.out.println("  50kr bills:"+ currency50); 
		System.out.println("  20kr bills:"+ currency20); 
		System.out.println("  10kr coins:"+ currency10); 
		System.out.println("   5kr coins:"+ currency5); 
		System.out.println("   1kr coins:"+ currency5Mod); 
		
		scan.close();
	}
}
