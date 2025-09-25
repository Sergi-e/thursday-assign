import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of your choice");
        int num=scan.nextInt();
        int count=0;
        int i;
        for(i=1;i<=num;i++){
         if(num%i==0){
            count++;
         }
        }
        if(count>2){
            System.out.print("Not a prime number");
        }
        else{
            System.out.print("It is a prime number");
        }
        



    }
}
