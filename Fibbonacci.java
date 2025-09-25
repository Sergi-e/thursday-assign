import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number of fibbonnacis you want");
    int num=scan.nextInt();
    int count=0;

    int fib=0;
    int temp=0;
    int f1=0; 
    int f2=1;
    while(count<=num){
        if(num==0){
            System.out.print("The fibbonacci doesn't exist");
        }
        else if(num==1){
            System.out.print("The fibbonacci is:" + num);
        }
        else{
            fib=f1+f2;
            temp=f2;
            f2=fib;
            f1=temp;
       }
       count++;
    }
    System.out.print("The required fibonnacci is:" + fib);
 }
}
    

    

