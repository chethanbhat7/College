import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int end=s.length()-1;
        String rev="";
        for(int i=end;i>=0;i--)
        {   
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }    
}
