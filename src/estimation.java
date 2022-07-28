import java.util.Scanner;

public class estimation {
    float length,breadth,height,area,v1,v2,v3,v4,v5,mortarV,dryV;
    float bricks;
    int cement;
    int sand;
    void area(){
        area = length*breadth;
        System.out.println("Area of site" + area + "sq m");
    }
    void bricks(){
        //v1 = volume of blockwork
        v1 = length*breadth*height;
        //v2 = volume of one brick with mortar
        v2 = (float) (0.1*0.1*0.2);
        bricks = v1/v2;
        System.out.println("Number of bricks required is" + bricks);
    }
    void cement(){
        //v3 = volume of one brick without mortar
        v3 = (float) (0.09*0.09*0.19);
        //v4 = volume of blockwork  without mortar
        v4 = bricks*v3;
        //v5 = volume of blockwork with mortar
        v5 = bricks*v2;
        //mortarV = wet volume of mortar
        mortarV = v5 - v4;
        //dryV = dry volume of mortar
        dryV = (float) (mortarV * 1.33);
        cement = (int) ((dryV * 1440)/250);
        System.out.println("Quantity of cement required is" + cement + "bags");
    }
    void sand(){
        sand = (int) ((dryV*4)/5);
        System.out.println("Quantity of sand required is" + sand + "cum");
    }
}
 class boq{
    public static void main(String[] args) {
        estimation home = new estimation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
         home.length =  sc.nextFloat();
        System.out.println("Enter the breath");
        home.breadth = sc.nextFloat();
        System.out.println("Enter the height");
        home.height =  sc.nextFloat();
        home.area();
        home.bricks();
        home.cement();
        home.sand();
        }
    }

