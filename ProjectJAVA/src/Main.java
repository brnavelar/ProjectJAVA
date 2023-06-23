import java.util.Scanner;

public class Main {

    private static Restaurante restaurant;
    private static Scanner scanner;

    public static void main(String[] args) {
    	restaurant = new Restaurante();
        scanner = new Scanner(System.in);

        showMenu();
    }

    private static void addTable() {
        System.out.println("---------- ADICIONAR MESA ----------");
        System.out.print("Digite o número da mesa: ");
        int numTable = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a capacidade da mesa: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Mesa table = new Mesa(numTable, capacity);
        try {
            restaurant.addTable(table);
            System.out.println("Mesa adicionada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar mesa: " + e.getMessage());
        }
    }

    private static void addOrder() {
        System.out.println("---------- ADICIONAR PEDIDO ----------");
        System.out.print("Digite o número da mesa: ");
        int numTable = scanner.nextInt();
        scanner.nextLine();

        Mesa table = restaurant.getTables().get(numTable);
        if (table == null) {
            System.out.println("Mesa não encontrada!");
            return;
        }

        restaurant.showMenu();
        System.out.print("Digite o número do item desejado: ");
        int numDish = scanner.nextInt();
        scanner.nextLine();

        Prato dish = null;
        switch (numDish) {
            case 1: 
                dish = new PratoPrincipal(1,"Macarrão ao molho branco com brócolis e bacon", "Macarrão com molho branco, brócolis e bacon", 28.00);
                break;
            case 2:
                dish = new PratoPrincipal(2,"Arroz com carne e legumes", "Arroz com carne e legumes", 35.00);
                break;
            case 3:
                dish = new Sobremesa(3, "Sorvete cremoso", "Sabores: morango e chocolate", 9.00);
                break;
            case 4:
                dish = new Sobremesa(4, "Pudim", "Sabores: tradicional e chocolate", 12.00);
                break;
            case 5:
                dish = new Bebida(5, "Vinho tinto", "Suave ou seco", 30.00);
                break;
            case 6:
                dish = new Bebida(6, "Refrigerante", "Refrigerantes: Coca cola, Guaraná, Fanta Laranja", 7.00);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                return;
        }

        table.addOrder(dish);
        System.out.println("Pedido adicionado com sucesso!");
    }
    
    private static void editOrder() {
        System.out.println("---------- EDITAR PEDIDO ----------");
        System.out.print("Digite o número da mesa: ");
        int numTable = scanner.nextInt();
        scanner.nextLine();

        Mesa table = restaurant.getTables().get(numTable);
        if (table == null) {
            System.out.println("Mesa não encontrada!");
            return;
        }

        System.out.println("Pedidos da mesa " + numTable + ":");
        int i = 1;
        for (Prato dish : table.getOrders()) {
            System.out.println(i + ". " + dish);
            i++;
        }

        System.out.print("Digite o número do pedido a ser editado: ");
        int numOrder = scanner.nextInt();
        scanner.nextLine();

        if (numOrder < 1 || numOrder > table.getOrders().size()) {
            System.out.println("Número de pedido inválido!");
            return;
        }

        Prato order = table.getOrders().get(numOrder - 1);
        System.out.println("Pedido selecionado: " + order);

        System.out.print("Digite o novo número do prato: ");
        int newNumber = scanner.nextInt();

        order.setNum(newNumber);

        System.out.println("Pedido editado com sucesso!");
    }
    
    private static void calcularTotalMesa() {
        System.out.println("========== CALCULAR TOTAL DA MESA ==========");
        System.out.print("Digite o número da mesa: ");
        int numMesa = scanner.nextInt();
        scanner.nextLine();

        try {
            double total = restaurant.calcBill(numMesa);
            System.out.println("Total a pagar: R$" + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao calcular total da mesa: " + e.getMessage());
        }
    }

    private static void removerMesa() {
        System.out.println("========== REMOVER MESA ==========");
        System.out.print("Digite o número da mesa: ");
        int numMesa = scanner.nextInt();
        scanner.nextLine();

        try {
        	restaurant.removeTable(numMesa);
            System.out.println("Mesa removida com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao remover mesa: " + e.getMessage());
        }
    }

    private static void exibirMenuSair() {
        System.out.println("Sistema Finalizado!");
        System.out.println("Volte sempre!");
        scanner.close();
        System.exit(0);
    }
    
    private static void showMenu() {
        while (true) {
            System.out.println("--- SEJA BEM VINDO AO RESTAURANTE! ---");
            System.out.println("------- ESCOLHA UMA DAS OPÇÕES -------");
            System.out.println("1. Adicionar mesa");
            System.out.println("2. Adicionar pedido");
            System.out.println("3. Editar pedido");
            System.out.println("4. Calcular total da mesa");
            System.out.println("5. Remover mesa");
            System.out.println("6. Sair");
            System.out.println("--------------------------------------");

            System.out.print("Digite a opção desejada: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addTable();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                	editOrder();
                    break;
                case 4:
                    calcularTotalMesa();
                    break;
                case 5:
                    removerMesa();
                    break;
                case 6:
                    exibirMenuSair();
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 6.");
                    break;
            }
        }
    }
}
