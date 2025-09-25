import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        //accepting the inputs
        System.out.print("Enter the number of your choice");
        num=scan.nextInt();
        int fact=1;
        while(num>0){
         fact*=num;
         num--;
 }
 System.out.println("The required factorial number is:" + fact);
 }
}
