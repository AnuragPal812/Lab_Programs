import java.util.Scanner;

public class Area {

    public static void circle(){
        System.out.println("enter the radius");
        Scanner cir = new Scanner(System.in);
        double radius = cir.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println(area);
        cir.close();
    }

    public static void rectangle(){
        System.out.println("Enter the length and the breadth");
        Scanner rec = new Scanner(System.in);
        int length = rec.nextInt();
        int breadth = rec.nextInt();
        int area = length*breadth;
        System.out.println(area);   
        rec.close();
    }
    public static void main(String[] args){
        System.out.println("Enter 1 for circle, 2 for rectangle");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                circle();
                break;
            case 2:
                rectangle();
                break;
                
            default:
                System.out.println("Enter correct input");
        }
        sc.close();
    }

}
