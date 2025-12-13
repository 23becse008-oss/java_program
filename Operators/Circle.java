import java.util.Scanner;//Write a Java Program to find the area of a circle.
public class Circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double radius=sc.nextDouble();
        Double area=Math.PI*radius*radius;
        System.out.print(area);
    }
}
