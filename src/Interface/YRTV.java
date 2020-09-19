package Interface;

public class YRTV implements School{

	@Override
	public void library() {

		System.out.println("library");
	}

	@Override
	public void lab() {

		System.out.println("lab");
	}
	
	public static void main(String[] args) {
		
		YRTV y = new YRTV();
		y.lab();
		y.library();
	}

}
