package Arrays;
// Remove duplicates from Sorted Array
/* Given a sorted array arr[] of size n, the goal is to rearrange the array so that all 
distinct elements appear at the beginning in sorted order. 
Additionally, return the length of this distinct sorted subarray. */

public class arr2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,4};
        for (int i = 0;i<= arr.length-1;i++){
            for(int j = i+1;j<= arr.length-1;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate elements found at index : " + i + " : "+j);
                }
            }
        }
    }
}
