import java.util.Scanner;
public class days {
    int days,weeks;
    public void determine(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of days");
       days = sc.nextInt();
       
       weeks = days/7;
       System.out.println("The number of weeks is "+weeks);

    }
    public static void main(String[] args){
        days D = new days();
        D.determine();
    }
}
