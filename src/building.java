import java.util.Scanner;

public class building {
    double length;
    double breadth;
    double height;
    double area;
    double v1;
    double v2;
    double v3;
    double v4;
    double v5;
    double mortarV;
    double dryV;
    double bricks;
    double cement;
    double sand;
    void area(){
        area = length*breadth;
        System.out.println("Area of site" + area + "sq m");
    }
    void bricks(){
        v1 = length*breadth*height;
        v2 = 0.1*0.1*0.2;
        bricks = v1/v2;
        System.out.println("Number of bricks required is" + bricks);
    }
    void cement(){
        v3 = 0.09*0.09*0.19;
        v4 = bricks*v3;
        v5 = bricks*v2;
        mortarV = v5 - v4;
        dryV = mortarV * 1.33;
        cement = (dryV * 1440)/250;
        System.out.println("Quantity of cement required is" + cement + "bags");
    }
    void sand(){
        sand = (dryV*4)/5;
        System.out.println("Quantity of sand required is" + sand + "cum");
    }
}
 class estimation{
    public static void main(String[] args) {
        building home = new building();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
         home.length = sc.nextDouble();
        System.out.println("Enter the breath");
        home.breadth = sc.nextDouble();
        System.out.println("Enter the height");
        home.height =  sc.nextDouble();
        home.area();
        home.bricks();
        home.cement();
        home.sand();
        }
    }

