import java.util.HashMap;

public class Restaurante {
    private HashMap<Integer, Mesa> tables;

    public Restaurante() {
        tables = new HashMap<>();
    }

    public Restaurante(HashMap<Integer, Mesa> tables) {
        this.tables = tables;
    }

    public void addTable(Mesa table) throws IllegalArgumentException {
        int num = table.getNum();
        if (tables.containsKey(num)) {
            throw new IllegalArgumentException("Mesa já existe");
        } else {
            tables.put(num, table);
        }
    }

    public void removeTable(int num) throws IllegalArgumentException {
        if (!tables.containsKey(num)) {
            throw new IllegalArgumentException("Mesa não encontrada");
        } else {
            tables.remove(num);
        }
    }

    public void registerOrder(int numTable, Prato dish) throws IllegalArgumentException {
        Mesa table = tables.get(numTable);
        if (table == null) {
            throw new IllegalArgumentException("Mesa não encontrada");
        } else {
            table.addOrder(dish);
        }
    }

    public double calcBill(int numTable) throws IllegalArgumentException {
        Mesa table = tables.get(numTable);
        if (table == null) {
            throw new IllegalArgumentException("Mesa não cadastrada!");
        }
        return table.calcBill();
    }

    public void showMenu() {
        System.out.println("--------------------------------------MENU-----------------------------------");
        System.out.println("Pratos Principais:");
        System.out.println("- Menu item 1: Macarrão ao molho branco com brocolis e bacon - Preço: R$28.00");
        System.out.println("- Menu item 2: Arroz com carne e legumes - Preço: R$35.00");
        System.out.println("Sobremesas:");
        System.out.println("- Sobremesa 1: Sorvete sabores (Morango e chocolate) - Preço: R$9.00");
        System.out.println("- Sobremesa 2: Pudin sabores (Tradicional e chocolate) - Preço: R$12.00");
        System.out.println("Bebidas:");
        System.out.println("- Bebida 1: Vinho tipos (Suave e seco) - Preço: R$3.00");
        System.out.println("- Bebida 2: Refrigerantes (Coca cola, Guaraná, Fanta Laranja) - Preço: R$7.00");
        System.out.println("-----------------------------------------------------------------------------");
    }
}
