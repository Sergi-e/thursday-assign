import java.util.Scanner;

public class Palyndrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number of your choice");
        int num=scan.nextInt();
        int rev=0;
        int  mod;
        while(num>0){
            mod=num%10;
            rev=mod+(rev*10);
            num=num/10;
        }  
        if (rev==num){
            System.out.print("This is a palyndrome number");
             }
        else{
            System.out.print("This is not a palyndrome number");
        }
       }
    
}
