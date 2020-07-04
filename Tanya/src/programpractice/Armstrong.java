package programpractice;

public class Armstrong {
	
	public static void main(String args[]) {
		
		int n =153;
		int rem;
		int rev=0;
		int temp=n;
		
		
		while(n>0) {
			
		rem=n%10;
		n=n/10;
		rev=rev+(rem*rem*rem);
		
	}
		if(temp==rev) {
		System.out.println("Armstrong");}
		else {
			System.out.println("Not Armstrong");

			
		}

}
}
