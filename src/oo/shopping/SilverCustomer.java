package oo.shopping;

public class SilverCustomer extends Customer{

	public SilverCustomer(int price) {
		super(price);
	}
	
	@Override
	public void print() {
		System.out.println(price + "\t" + (price*discount) + "\t0");
				
	}
}
