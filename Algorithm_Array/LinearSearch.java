//Linear Search Algorithms

package Algorithm_Array;

public class LinearSearch {
        public static int search(int arr[], int x){
            int N= arr.length;
                for(int i=0 ; i < N ; i++){
                if(arr[i] == x)
                return i;
            }
            return -1;
        }

public static void main(String Args[]){
    int arr[]= {20, 30, 40, 45, 60, 70};
    int x= 70;

    int result= search(arr, x);
        if(result == -1)
            System.out.println("element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
    
}