package searching;

public class BinarySearch {

    public static boolean binarySearch(int[] array, int element){
       int low = 0;
       int high = array.length - 1;
       
       while(low <= high){
           int mid = low + (high - low) / 2;
           if(array[mid] == element) return true;
           else if(array[mid] > element) high = mid - 1;
           else low = mid + 1;
       }
       
       return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,99,100,123,235}; 

        System.out.println(binarySearch(array, 0));
        
        System.out.println(binarySearch(array, 5));
    }
}
