
public class PratoPrincipal extends Prato {
	
	public PratoPrincipal() {
		
	}
	
	 public PratoPrincipal(int num, String name, String description, double price) {
	        super(num, name, description, price);
	    }

		public double calcPrice() {
	        return getPrice();
	    }
	}
