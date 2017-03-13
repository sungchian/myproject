package payhelper;

public class Pay {
	String type;
	int fare;
	String route;
	String paymentMethods;
	public Pay(String type, int fare, String route, String paymentMethods){
		this.type = type;
		this.fare = fare;
		this.route = route;
		this.paymentMethods = paymentMethods;
	}
}
