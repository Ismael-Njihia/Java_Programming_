import java.util.Scanner;
public class assignment {
    int ass1,ass2,sum;
    double average;
    public void getdetails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of the first assignment");
        ass1 = sc.nextInt();
        System.out.println("Enter the marks of the second assignment");
        ass2 = sc.nextInt();
        if(ass1>5 || ass2>5){
            System.out.println("Invalid marks");
        }
        else{
            sum = ass1+ass2;
            average = sum/2;
            System.out.println("The average is "+ average);
        }
    }
    public void determine(){
        if(average>=5){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        
    }
    public void display(){
        System.out.println("Assignment 1 "+ass1);
        System.out.println("Assignment 2 "+ass2);
        System.out.println("Sum "+sum);
        System.out.println("Avwrage "+average);
    }
    public static void main(String[] args) {
        assignment A = new assignment();
        A.getdetails();
        A.determine();
        A.display();
    }
    
}
