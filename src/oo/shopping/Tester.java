package oo.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("1.一般會員"+"\n"+ "2.銀級會員 "+"\n"+"3.金級會員");
		Scanner sca = new Scanner(System.in);
		int n = Integer.parseInt(sca.nextLine());
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(8000));
		list.add(new SilverCustomer(20000));
		list.add(new GoldenCustomer(50000));
		list.add(new SilverCustomer(7000));
		list.add(new GoldenCustomer(18000));
		for (int i=0; i<list.size(); i++){
			Customer cust = list.get(i);
			if (cust instanceof SilverCustomer &&
					!(cust instanceof GoldenCustomer)){
				System.out.print("*");
			}
			cust.print();
		}
	}

}
