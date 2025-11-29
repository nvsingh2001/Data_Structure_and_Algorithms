package sorting;

public class TernarySearch {

    public static boolean ternarySearch(int[] array, int low, int high, int element){
        if(high >= low){
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if(array[mid1] == element || array[mid2] == element) return true;
            
            if(element < array[mid1]){
                return ternarySearch(array, low, mid1 - 1, element);
            } 
            else if(element > array[mid2]){
                return ternarySearch(array, mid2 + 1, high, element);
            }else{
                return ternarySearch(array, mid1 + 1, mid2 - 1, element);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,99,100,123,235}; 
        System.out.println(ternarySearch(array, 0, array.length - 1, 0));
        
        System.out.println(ternarySearch(array, 0, array.length - 1, 100));
    }
}
