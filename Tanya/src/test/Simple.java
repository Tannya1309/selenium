package test;

public class Simple {
	public void tanya() {
		System.out.println("hello");
	}
	public void tanya(int a) {
		System.out.println(a);
	}
	 public	static void main(String args[]) {
		  Simple s = new Simple();
		  s.tanya();
		  s.tanya(6);
		  
		  SBI h =new SBI();
		  Axis x=new Axis();
		  
		 
		  
		  System.out.println(h.tax());
		  System.out.println(x.tax());
		 
	 }
}