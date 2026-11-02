public class LinearSearch {
    public static int linear(int[] arr,int target, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return linear(arr,target,++i);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,8,0};
        System.out.println(linear(arr,8, 0));
    }
}