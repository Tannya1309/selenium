package test;

public class Simple1 implements printable, showable  {

	@Override
	public void showable() {
		System.out.println("Show");
		
	}

	@Override
	public void print() {
		System.out.println("Print");
		
	}

}
