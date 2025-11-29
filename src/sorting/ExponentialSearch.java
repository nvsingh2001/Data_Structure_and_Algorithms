package sorting;

public class ExponentialSearch {

    public static boolean binarySearch(int[] array, int low, int high, int target){
        if(low <= high){
            int mid = low + (high - low) / 2;

            if(array[mid] == target) return true; 
            else if(array[mid] > target){
                return binarySearch(array, low, mid - 1, target);
            }else{
                return binarySearch(array, mid + 1, high, target);
            }
        }
        return false;
    }

    public static boolean exponentialSearch(int[] array, int target){
        if(array[0] == target){
            return true;
        }

        int i = 1;
        while(i < array.length && array[i] <= target){
            i *= 2;
        }

        return binarySearch(array, i/2 , Math.min(i,array.length) , target);
    }

    public static void main(String[] args) {
        
        int[] array = {1,2,4,5,6,99,100,123,235}; 

        System.out.println(exponentialSearch(array, 0));
        System.out.println(exponentialSearch(array, 100));
        System.out.println(exponentialSearch(array, 2));
    }
}
