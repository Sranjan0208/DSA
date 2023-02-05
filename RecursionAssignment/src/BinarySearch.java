public class BinarySearch {
    // https://leetcode.com/problems/binary-search/description/
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(arr, target, 0 ,arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, target, mid+1, e);
        } else {
            return binarySearch(arr, target, s, mid-1);
        }
    }
}
