package oo.obstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		String s = "331";
		//----------0123456789
		String n = "1350754331";
		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
		System.out.println(sub);
		
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("866");
		System.out.println("請輸入發票號碼");
		Scanner scanner = new Scanner(System.in);
		
	}

}
