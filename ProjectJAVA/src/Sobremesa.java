
public class Sobremesa extends Prato {
	public String flavor;
	
	public Sobremesa() {
		
	}
	
	public Sobremesa(String flavor, String name, String description, double price) {
		super(name, description, price);
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public double calcPrice() {
		return getPrice();
	}
	
}
