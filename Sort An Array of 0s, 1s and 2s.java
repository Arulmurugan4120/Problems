//https://www.naukri.com/code360/problems/sort-an-array-of-0s-1s-and-2s_892977?leftPanelTabValue=SUBMISSION
import java.util.* ;
import java.io.*;
public class Solution {
public static void sortArray(ArrayList<Integer> arr, int n) {
int start=0;
int mid=0;
int end=n-1;
int temp=0;
for(int i=0;i<n;i++)
{
    if (arr.get(mid)==0)
    {
        temp=arr.get(mid);
        arr.set(mid,arr.get(start));
        arr.set(start,temp);
        mid++;
        start++;
        }
        else if(arr.get(mid)==1)
        {
            mid++;
            }
            else
            {
                temp=arr.get(mid);
                arr.set(mid,arr.get(end));
                arr.set(end,temp);
                end--;
            }
        }
    }
 }
