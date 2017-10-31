package ma223zf_assign1;

public class Second {
	int h;
	int m;
	int s;
	
	
	public void setData(int h , int m , int s){
	
	 this.h=h;
	 this.m=m;
	 this.s=s;
	}
	public void sum(){
		int sum=60*60*this.h+ 60*this.m + this.s;
		System.out.println("The sum of time in seconds is: "+sum);
		
	
	}
	public static void main(String[]args){
		Second obj1=new Second();
		obj1.setData(2, 15, 8);
		obj1.sum();
		Second obj2=new Second();
		obj2.setData(4, 8, 40);
		obj2.sum();
		
	}
}
