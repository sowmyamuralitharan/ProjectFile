package Abstrct;

public class Staff extends Employee {

	@Override
	public void increment() {

		System.out.println("increment my salary");
	}
	
	public static void main(String[] args) {
		
		Staff f = new Staff();
		f.increment();
		f.loan();
		f.salary();
		f.houseloan();
	}

}
