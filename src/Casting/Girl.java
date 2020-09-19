package Casting;

public class Girl extends Boy {
	
	@Override
	public void girl() {
		super.girl(); 
		System.out.println("priya got married");
	}
	
	public static void main(String[] args) {
		
		Girl g = new Girl();                // new Boy(); downcasting is not possible
		g.girl();
	}

}
