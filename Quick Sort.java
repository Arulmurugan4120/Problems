//https://www.naukri.com/code360/problems/quick-sort_5844?leftPanelTabValue=PROBLEM
public class Solution {
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex<endIndex){
			 int keyVal=partition(input,startIndex,endIndex);
			 quickSort(input,startIndex,keyVal-1);
			 quickSort(input,keyVal+1,endIndex);
		 } 
	}
	public static int partition(int[] input,int startIndex,int endIndex){
		int keyVal=input[startIndex];
		int i=startIndex;
		int j=endIndex;
		while(i<j){
			while(input[i]<=keyVal && i<endIndex){
				i++;
			}
			while(input[j]>=keyVal && j>startIndex){
				j--;
			}
			if(i<j){
				swap(input,i,j);
			}
		}
			swap(input,startIndex,j);
			return j;
	}
	public static void swap(int[] input,int i,int j){
			int temp=input[i];
			input[i]=input[j];
			input[j]=temp;
	}
}
