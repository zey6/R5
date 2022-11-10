import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        System.out.println("Enter x :"+x);
        System.out.print("Enter y: "+y);
        Point q = new Point( 14, 12);
        Point p = new Point(x,y);
        Circle circle40 = new Circle(q,  40.0);
        Circle circle16 = new Circle(p,  16.0);

        if(circle16.intersects(circle40))
        {
            System.out.println("circle intersect!");
        }else
        {
            System.out.println("circle do not intersect!");
;        }
        // add your code here

        return;
    }
}
