import java.util.Scanner;

class discount {
    int a,b,cost;
    double disc=0.05;
    double amount;
    double final;
    public void getdetails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the price of the milk");
        a = sc.nextInt();
        System.out.println("Enter the price of the milk");
        b = sc.nextInt();
    }
    public void calculate(){
     cost = a+b;
     amount = disc *cost;
     final = cost-amount;
     System.out.println("Total to pay is "+ final);



    }
     public static void main(String[] args) {
         discount D = new discount();
         D.getdetails();
         D.calculate();
        
    }
  
}