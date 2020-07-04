package testabstract;

public class testsbstractmulti extends printable {

	public static void main(String[] args) {
		
		testsbstractmulti obj = new testsbstractmulti();
		obj.print();
		obj.show();

	}

	@Override
	void print() {
		System.out.println("Print");
		
	}

}
