//https://www.naukri.com/code360/problems/find-the-single-element_6680465?leftPanelTabValue=PROBLEM
public class Solution {
public static int getSingleElement(int []arr){
// Write your code here.
int num = 0;
if(arr.length == 1)
return arr[0];
for(int i=1;i< arr.length - 2; i++){
if(arr[i-1] != arr[i] && arr[i] != arr[i+1]){
num = arr[i];
break;
}
}
if(num == 0 && arr[0] != arr[1])
{ 
    num = arr[0];
    }
else if(num == 0 && arr[arr.length-1] != arr[arr.length-2])
{ 
    num = arr[arr.length-1];
    }
return num;
}
}
