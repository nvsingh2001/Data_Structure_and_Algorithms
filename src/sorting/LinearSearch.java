package sorting;

public class LinearSearch {

    public static boolean linearSearch(int[] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {3,5,6,3,22,58,92,4,2};
        System.out.println(linearSearch(array,4));
    }
}
