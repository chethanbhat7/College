import java.util.Scanner;
public class pali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int revnum=0;
        int copyn=n;
        while(copyn!=0)
        {   
            revnum+=copyn%10;
            revnum*=10;
            copyn/=10;
        }
        revnum/=10;
        if(n==revnum)
        System.out.println("True");
        else 
        System.out.println("False");
        
    }
}
