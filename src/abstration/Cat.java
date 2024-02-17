package abstration;

public class Cat extends Animal {
	
	public void sound() {
		System.out.println("Meow Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cl=new Cat();
		cl.walk();
		cl.run();
		cl.sound();
		
		
	}

}
