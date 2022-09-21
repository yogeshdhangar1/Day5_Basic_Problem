public class SumofThreeInteger {
    public static void Fine(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Found three element integer  sum is = 0");
                        System.out.println("Element are:" + arr[i] + " " + arr[j] + " " + arr[k]);
                        return;
                    }
                }
            }
        }
        System.out.println("Element not Found sum of three is = 0");
    }
    public static void main(String[] args) {
     int arr[] = {3,-1,-7,-4,-5,9,10};
     Fine(arr);
    }
}
