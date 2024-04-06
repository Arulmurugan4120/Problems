//https://www.naukri.com/code360/problems/sum-of-even-odd_624650?leftPanelTabValue=SUBMISSION
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int even = 0;
        int odd = 0;
        while(num != 0){
            int rem = num % 10;
            if(num % 2 == 0){
                even = even + rem;
            }
            else{
                odd = odd + rem;
            }
            num = num / 10;
        }
        System.out.print(even + " " + odd);
    }
}
