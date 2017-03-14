package payhelper;

public class Pay {
	String field;						//食衣行樂擇一//
	int fare;							//價錢//
	String type;						//類型：食物名＾衣服＾電影//
	String paymentMethods;				//現金＾信用卡//
	public Pay(String field, int fare, String type, String paymentMethods){
		this.field = field;
		this.fare = fare;
		this.type = type;
		this.paymentMethods = paymentMethods;
	}

}
