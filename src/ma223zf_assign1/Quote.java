package ma223zf_assign1;
import java . util .Scanner; // get scanner from java library//

public class Quote {
	public static void main(String args[]){
		 /*create an object of scanner 
		connected to keyboard*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Write a line of text:"); //user instruction//
		String user_Input = scan.nextLine (); //read string//
		System.out.println(user_Input);
		System.out.println("Quote:"+"\""+user_Input+"\"");
        scan.close();
	}
	
		
}

