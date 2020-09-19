package Abstrct;

public class Bank implements SBI,CANARA {

	@Override
	public void loan() {
		System.out.println("Total loan is 50%");
	}

	@Override
	public void officeloan() {

		System.out.println("office loan 8%");
	}

	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.loan();
		b.studyloan();
		b.officeloan();
		b.homeloan();
	}

	@Override
	public void studyloan() {

		System.out.println("studyloan 66%");
	}

	@Override
	public void homeloan() {

		System.out.println("home loan 44%");
	}
}

