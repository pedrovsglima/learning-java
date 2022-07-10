public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double area () {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }

}   
