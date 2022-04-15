import java.util.Scanner;
public class booking {
   string name,destination;
   int idno;
   public void getdetails(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name");
         name = sc.nextLine();
         System.out.println("Enter the destination");
         destination = sc.nextLine();
         System.out.println("Enter the id number");
         idno = sc.nextInt();
   } 
   public void display(){
         System.out.println("Name "+name);
         System.out.println("Destination "+destination);
         System.out.println("Id number "+idno);
   }
   public static void main(String[] args) {
            booking B = new booking();
            B.getdetails();
            B.display();
   }
}
