public class question7{
     public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,12};
        int lastelem = arr[arr.length-1];


        for(int i = arr.length-1 ; i > 0;i--) {
                arr[i] = arr[i-1];
        }
        arr[0] = lastelem;
        
        System.out.println("One Cyclical rotate array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
