package oo.mid;

public class MealOrder {
	String MainMeal;
	String ViceMeal;
	int Quantity;
	float price;
	
	public MealOrder(String MainMeal, String ViceMeal, int Quantity, float price){
		this.MainMeal = MainMeal;
		this.ViceMeal = ViceMeal;
		this.Quantity = Quantity;
		this.price = price;
	}
	public void setPrice(int w){
		price = w;
	}
	public float addPrice(int w){
		return price;
	}
}
