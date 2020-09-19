package Inheritance1;

    class GrandFather {
		
		void family()
		{
			System.out.println("Grandpa is the Best");
		}
	}
	class Father extends GrandFather {
		
		void advice()
		{
			System.out.println("Good Father");
		}
	}
	class Daughter extends Father{
		
		void listener()
		{
			System.out.println("Good Daughter");
		}
	}
	
	public class MultilevelIn1 {
		
		public static void main(String[] args) {
			
			Daughter d = new Daughter();
			d.family();
			d.advice();
			d.listener();
		}
}
	