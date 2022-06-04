package depackage;

public class App {
	public static void main(String[] args) {
		Bicycle myBicycle = new Bicycle();
		
		myBicycle.color = "Black";
		myBicycle.size = 27;
		myBicycle.brand = "BTWIN";
		myBicycle.price = 589.99;
		myBicycle.inStock = true;
		
		Bicycle myBicycle2 = new Bicycle();
		
		myBicycle2.color = "Grey";
		myBicycle2.size = 19;
		myBicycle2.brand = "DECATHLON";
		myBicycle2.price = 229.99;
		myBicycle2.inStock = true;
		
		System.out.println(myBicycle2.price);
	}
	
	
	

}
