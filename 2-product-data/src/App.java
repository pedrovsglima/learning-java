import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product prod = new Product(name, price, quantity);
        prod.removeProducts(50);
        System.out.println(prod);

        Product prod1 = new Product(name, price);
        prod1.addProducts(50);
        System.out.println(prod1);

        sc.close();
    }
}
