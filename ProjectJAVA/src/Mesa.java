import java.util.ArrayList;
import java.util.List;

public class Mesa {
	private int numTable;
    private int capacity;
    private List<Prato> orders;
    
    public Mesa() {
    	
    }

    public Mesa(int numTable, int capacity) {
        this.numTable = numTable;
        this.capacity = capacity;
        this.orders = new ArrayList<>();
    }

    public int getNumTable() {
		return numTable;
	}

	public void setNumTable(int numTable) {
		this.numTable = numTable;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Prato> getOrders() {
		return orders;
	}

	public void setOrders(List<Prato> orders) {
		this.orders = orders;
	}

    public void addOrder(Prato dish) {
        orders.add(dish);
    }

    public double calcBill() {
        double total = 0;
        for (Prato dish : orders) {
            total += dish.calcPrice();
        }
        return total;
    }
}

