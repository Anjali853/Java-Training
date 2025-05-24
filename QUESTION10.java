public class QUESTION10{
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        int rightMax = arr[n-1];

        System.out.println(rightMax);

        for(int i = n-2; i >=0; i--){
            if(arr[i] > rightMax){
                rightMax = arr[i];
                     System.out.println(rightMax);

            }
        }
    }
}