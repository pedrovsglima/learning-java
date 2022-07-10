import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        // 1
        Product prod = new Product();
        prod.setName("TV");
        prod.setPrice(500);;
        prod.addProducts(50);
        System.out.println(prod);

        // 2
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product prod1 = new Product(name, price);
        System.out.println(prod1);

        // 3
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product prod2 = new Product(name1, price1, quantity);
        System.out.println(prod2);

        
        sc.close();
    }
}
