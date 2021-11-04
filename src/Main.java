import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double a,b,c,area,circumfence,u,h;
        Scanner edges = new Scanner(System.in);

        System.out.print("Enter the first edge of triangle: ");

        a=edges.nextInt();

        System.out.print("Enter the second edge of triangle: ");

        b=edges.nextInt();


        //hipotenüs
        c = Math.sqrt((a*a)+(b*b));
        //alan ve çevre
        u = (a+b+c)/2;
        circumfence = 2*u;
        area = u * (u-a) * (u-b) * (u-c);

        System.out.println("Hipotenus of triangle "+c);
        System.out.println("Circumfence of triangle "+circumfence);
        System.out.println("Area of triangle "+area);
    }
}
