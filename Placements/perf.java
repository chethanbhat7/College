import java.util.ArrayList;
import java.util.Scanner;
public class perf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                arr.add(i);
            }
        }
        int sum=0;
        for(Integer i:arr)
        {
            sum+=i;
        }

        if(sum==n)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
