public class CheckSorted {
    static boolean check(int[] arr, int i, boolean val) {
        if(val == false) return false;
        if(i == arr.length - 2) return arr[i] < arr[i+1];
        return check(arr, ++i, arr[i] < arr[i+1]);
    }
    public static void main(String[] args) {
        System.out.println(check(new int[] {1,8,4,5,6},0,true));
    }
}