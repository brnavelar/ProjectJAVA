
public class Bebida extends Prato {
	public String typeOfDrink;
	
	public Bebida() {
		
	}
	
	public Bebida(String typeOfDrink, String name, String description, double price) {
		super(name, description, price);
		this.typeOfDrink = typeOfDrink;
	}

	public String getTypeOfDrink() {
		return typeOfDrink;
	}

	public void setTypeOfDrink(String typeOfDrink) {
		this.typeOfDrink = typeOfDrink;
	}
	
	public double calcPrice() {
		return getPrice();
	}
}
