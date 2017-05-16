package oo.shopping;

public class GoldenCustomer extends Customer{
	float cashback = 0.05f;
	
	public GoldenCustomer(int price) {
		super(price);
	}
	@Override
	public void print() {
		System.out.println(price + "\t" + (price*discount) + "\t" +
				(price*cashback));
	}
	
}
