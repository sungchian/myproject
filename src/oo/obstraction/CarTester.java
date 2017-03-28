package oo.obstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 1800, "Altis");
		Car c2 = new Car("Honda", 2000, "Accord");
		Car c3 = new Car("Toyota", 2000, "Wish");
		int[] n = new int[5];
		
		System.out.println(n[2]);
		
		Car[] cars = new Car[3];
		cars[0] = new Car("Toyota", 1800, "Altis");
		cars[1] = new Car("Honda", 2000, "Accord");
		cars[2] = new Car("Toyota", 2000, "Wish");
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 402;
		System.out.println(cars[0]);
		System.out.println(cars[0].name);
		int i=0;
		for (i=0; i<3; i++){
			System.out.println(cars[i].name);
		}
		System.out.print(i);
	}
	class AA{
		
	}
	AA a = new AA();
}
