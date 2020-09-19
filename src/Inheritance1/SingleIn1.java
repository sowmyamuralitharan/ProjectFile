package Inheritance1;

class Principal {
	
	void msg()
	{
		System.out.println("i am the Principal of this college");
	}
}
class Hod extends Principal{
	
	void anouncement()
	{
		System.out.println("i am the HOD of computerScience Department");
	}
}

	public class SingleIn1 {
	public static void main(String[] args) {
		
		//Principal p = new Principal();
		//p.msg();
		//p.anouncement();                                            // error 
		
		Hod h = new Hod();
		h.msg();
		h.anouncement();
	}

}
