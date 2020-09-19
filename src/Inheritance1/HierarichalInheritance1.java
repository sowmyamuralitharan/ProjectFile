package Inheritance1;

class House{
	
	void home()
	{
		System.out.println("Home sweet Home");
	}
}
class Hall extends House{
	
	void design()
	{
		System.out.println("Hall design");
	}
}
class Kitchen extends House{
	
	void room()
	{
		System.out.println("interior design");
	}
}

public class HierarichalInheritance1 {
	
	public static void main(String[] args) {
		
		Kitchen k = new Kitchen();
		Hall h = new Hall();
		
		k.home();
		k.room();
		h.design();
		h.home();
	}
	

}
