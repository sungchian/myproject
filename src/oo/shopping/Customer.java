package oo.shopping;

public class Customer {
	int price;
	int discount;
	int cashback;
	
	
	public Customer(int price, int discount, int cashback){
		this.price = price;
		this.discount = discount;
		this.cashback = cashback;
	}
	public void cCustomer(int price){
		this.price = price;
	}
	public void print(){
		System.out.println(price+"\n"+discount+"\n"+cashback);
	}
	protected String getPrice(int price){
		System.out.println(price*0.1);
	}
}
