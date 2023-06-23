public class Main {

	public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Mesa m1 = new Mesa(1, 2);
        Mesa m2 = new Mesa(2, 2);

        Prato p1 = new PratoPrincipal("Menu item 1", "Prato principal","Macarrão ao molho branco com brocolis e bacon", 28.00);
        Prato p2 = new PratoPrincipal("Menu item 2", "Prato principal","Arroz com carne e legumes", 35.00);
        Prato s1 = new Sobremesa("Sobremesa 1", "Sorvete cremoso", "Chocolate", 9.00);
        Prato s2 = new Sobremesa("Sobremesa 2", "Pudin", "Tradicional", 12.00);
        Prato b1 = new Bebida("Bebida 1", "Vinho tinto", "Suave", 30.00);
        Prato b2 = new Bebida("Bebida 2", "Coca cola", "Refrigerante", 7.00);
        	restaurante.showMenu();
        	        	
            restaurante.addTable(m1);
            restaurante.addTable(m2);
            
            restaurante.registerOrder(1, p2);
            restaurante.registerOrder(1, p2);
            restaurante.registerOrder(1, s1);
            restaurante.registerOrder(1, b1);
            
            restaurante.registerOrder(2, p1);
            restaurante.registerOrder(2, p1);
            restaurante.registerOrder(2, b1);
            restaurante.registerOrder(2, s2);

            double billTable1 = restaurante.calcBill(1);
            double billTable2 = restaurante.calcBill(2);

            System.out.println("Conta da Mesa 1: R$" + billTable1);
            System.out.println("Conta da Mesa 2: R$" + billTable2);
            
            try {
            	restaurante.addTable(m2);
            	System.out.println("Mesa adicionada com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao adicionar mesa: " + e.getMessage());
            }
            
            try {
            	restaurante.removeTable(3);
            	System.out.println("Mesa removida com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao remover mesa: " + e.getMessage());
                }
           
        } 
    }