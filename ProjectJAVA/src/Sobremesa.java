
public class Sobremesa extends Prato {
	
	public Sobremesa() {
		
	}
	
	public Sobremesa(int num, String name, String description, double price) {
		super(num, name, description, price);
	}
	
	public double calcPrice() {
		return getPrice();
	}
	
}
