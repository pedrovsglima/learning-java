import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();

        System.out.println("calculates the area of a triangle given three sides:");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();

        System.out.println("area: "+ x.area());

        sc.close();
    }
}
