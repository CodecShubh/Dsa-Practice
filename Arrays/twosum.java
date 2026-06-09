package Arrays;

public class twosum {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,11};
        int sum = 9;
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.print("Numbers that are added : " + arr[i] + " + " + arr[j]);
                }
                System.out.println();
            }
        }
    }
}
