package oo.shopping;

public class Customer {
	int price;
	float discount = 0.1f;
	float cashback = 0.05f;
	
	
	public Customer(int price){
		this.price = price;
		
	}
	public void cCustomer(int price){
		this.price = price;
		System.out.println("your cost" + price);
	}
	public void print(){
		System.out.println(price+"\t"+price+"\t0");
	}
	
}
