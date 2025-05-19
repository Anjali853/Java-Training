public class question5 {
    public static void main(String[] args) {
        
        int arr[]={-1,-20,30,40,50,-8};
        int n =arr.length;
        question5(arr, n);

        for(int i : arr){
            System.out.println(i +" ");
        }
    }
    private static void question5 (int[]arr,int n){
        int tempAll[] = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]<0){
            tempAll[j++] = arr[i];
                }
            }
            
            for (int i = 0; i < n; i++){
                if(arr[i] >= 0) {
                    tempAll[j++] = arr[i];
                }
            }
            for (int i = 0; i < n; i++){
                arr[i] = tempAll[i];
            }
        }
    } 



