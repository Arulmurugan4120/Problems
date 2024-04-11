//https://www.naukri.com/code360/problems/check-armstrong_589?leftPanelTabValue=PROBLEM
import java.util.Scanner;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int buff=n;
        String str=Integer.toString(n);
        int len=str.length();
        int sum=0;
        while(n>0){
            int l=n%10;
            sum+=Math.pow(l,len);
            n/=10;
        }
        if (buff==sum){
			 System.out.println("true");
		}
        else{
			System.out.println("false");
		}
    }
}
