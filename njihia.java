import java.util.Scanner;
class circle{
    double pie=3.142;
    float radius;
    double Area;

    public void getdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextFloat();

    }
    public void getArea(){
        Area = radius * radius * pie;
        System.out.println("Area is"+Area);
    }
    public static void main(String[] args) {
        circle C = new circle();
        C.getdetails();
        C.getArea();
        
    }
    
}