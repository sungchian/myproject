package oo.obstraction;

public class Car {
	int id;
	String brand;
	int cc;
	String name;
	String type;
	int status;
	float milage;

	public Car(String brand, int cc, String name) {
		this.brand = brand;
		this.cc = cc;
		this.name = name;
	//	this.type = type;
	}

	public void setMilage(int m) {
		milage = m;

	}

	public float addMilage(int m) {
		milage = milage + m;
		return milage;
	}

	public void maintain() {
		status = 5;
	}
}
