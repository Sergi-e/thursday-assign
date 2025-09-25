import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number of fibbonnacis you want");
    int num=scan.nextInt();
    int count=0;

    int temp, fib;
    int fib1=0; 
    int fib2=1;
    while(count<=num){
        if(num==0){
            System.out.print("The fibbonacci doesn't exist");
        }
        else if(num==1){
            System.out.print("The fibbonacci is:" + num);
        }
        else{
            fib=fib1+fib2;
            temp=fib1;
            fib1=fib2;
            fib2=temp;
       }
       count++;
    }
    System.out.print("The required fibonnacci is:" +fib);
 }
}
    

    

