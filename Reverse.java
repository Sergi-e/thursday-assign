import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number of your choice");
        int num=scan.nextInt();
        int rev=0;
        int  mod;
        while(num>0){
            mod=num%10;
            rev=mod+(rev*10);
            num=num/10;
        }  
        System.out.println("The reverse number is:" +rev);
    }
}