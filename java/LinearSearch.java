// Find weather 14 exists in array or not.

public class LinearSearch {

    public static void linear(int arr[], int n){
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i]){
                System.out.println("Element exist in array");
                break;
                // return 1;
            }
            else{
                System.out.println("Element don't exist");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4};
        linear(arr, 14);
    }    
}
