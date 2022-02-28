package courseWork;
import java.util.Scanner;


public class courseWorkArea {

	public static void main(String[] args) {
        
		for(int i=0; i<3; i++) {
		System.out.println("Which object do you have?");
		System.out.println("1.Triangle");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		
		if(choice == 1) {
			double base, height, area;
		    System.out.println("Enter the base of the triangle: ");
			base = scan.nextDouble();
		    System.out.println("Enter the height of the triangle: ");
		    height = scan.nextDouble();
		     area = (base*height)/2;
			     if (base<=0 || height<=0) {
		            System.out.println("Invlaid Inputs!!");
			    }
			    else {
			    	 System.out.println("The area of the triangle is: "+ area);
			    }
		}
            
           else if(choice == 2) {
              double length, width,area;
		      System.out.println("Enter the length of the rectangle: ");
		       length = scan.nextDouble();
		       System.out.println("Enter the width of the rectangle: ");
		       width = scan.nextDouble();
		       area = length * width;
		       
			       if (length<=0 || width<=0) {
			            System.out.println("Invlaid Inputs!!");
				    }
				    else {
				    	 System.out.println("The area of the rectangle is: "+ area);
				    }
		       
           } 
           else if(choice == 3) {
		         double radius,area;
		         System.out.println("Enter the radius of the circle: ");
		         radius = scan.nextDouble();
		         area = 3.142 * radius * radius;
		         if(radius<=0) {
		        	 System.out.println("Invalid Inputs");
		         }
		         else {
		        	 System.out.println("The area of the circle is: "+ area);
		         }
		         
	}
		        else
		        	System.out.println("Invalid Choice!!");
	}

	}
	
}
