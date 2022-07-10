import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        prod.name = sc.nextLine();

        System.out.print("Price: ");
        prod.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        prod.quantity = sc.nextInt();

        prod.removeProducts(50);

        System.out.println(prod);

        sc.close();
    }
}
