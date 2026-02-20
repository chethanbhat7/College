import java.util.Scanner;
public class Fib{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFib(1,1,n);
    }
    static void printFib(int a,int b,int n)
    {   
        if(n==0)
        return;
        System.out.println(a);
        int temp=a+b;
        a=b;
        b=temp;
        printFib(a, b, n-1);    
    }
}