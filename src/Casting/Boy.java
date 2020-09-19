package Casting;

public class Boy {
	
	public void girl() {

		System.out.println("newly married");
	}
	
	public static void main(String[] args) {
		
		Boy b = new Boy();                            //new Girl(); upcasting is possible
		b.girl();
	}
}

