import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,78,54,12,90,238,345,900};
        System.out.println(Arrays.toString(sort(arr, 0)));
    }

    static int[] sort(int[] arr, int i){
        if(i == arr.length -1){
            return arr;
        }

        for (int j = i+1; j > 0; j--) {
            if(arr[j] < arr[j-1]){
                swap(arr, j , j-1);
            }
        }


        return sort(arr, i+1);

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
