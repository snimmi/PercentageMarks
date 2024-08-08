import java.util.Scanner;
public class InputFromUser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("enter a secont no.:");
        int b=sc.nextInt();
        int product=a*b;
        System.out.println(product);
        

    }
    
}