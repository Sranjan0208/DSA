import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {

        int  k= 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }



        for(int i=j+1; i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(nums));

    }

    static void swap(int a, int b){
        int temp = b;
        b =a ;
        a = temp;

    }
}
