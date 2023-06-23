
public class Bebida extends Prato {
	
	public Bebida() {
		
	}
	
	public Bebida(int num, String name, String description, double price) {
		super(num, name, description, price);
	}

	public double calcPrice() {
		return getPrice();
	}
}
