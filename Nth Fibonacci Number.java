//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?leftPanelTabValue=PROBLEM
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        /* Your class should be named Solution.
        * Read input as specified in the question.
        * Print output as specified in the question.
        */
		Scanner input=new Scanner(System.in);
		int a=0,b=1,temp=0;
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
		}
			System.out.println(a);
	}
}
