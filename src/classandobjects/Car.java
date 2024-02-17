package classandobjects;

public class Car {

	int Wheels=4;
	int Streering=1;
	
	public void accelrate() {
		
		System.out.println("Increase the speed");
	}
	
	public void breaks() {
		
		System.out.println("Stops the Car");
	}
	

	public static void main(String[] args) {
		
		Car BMW=new Car();
		
		System.out.println(BMW.Wheels);
		System.out.println(BMW.Streering);
		
		BMW.accelrate();
		BMW.breaks();
		
        Car Audi=new Car();
		
		System.out.println(Audi.Wheels);
		System.out.println(Audi.Streering);
		
		Audi.accelrate();
		Audi.breaks();
	}
}
