public class question38 {
    public static void main(String[] args) {
        
            int[][] matrix = {
            {10, 20, 30, 40},
            {40, 50, 60, 70},
            {27, 29, 28, 37},
            {32, 33, 39, 66}
         };

         int target = 20;
         int rows = matrix.length;
         int  cols = matrix[0].length;

         int i = 0, j = cols-1; 

         boolean found = false;
            while (i < rows && j >= 0){

            if  (matrix[i][j] == target)
            {
            
               System.out.println("Found at ("+ i + ", "+ j + ")");

               found = true;
               break;
            }else if(matrix[i][j] > target){
               j--;
            } else {
               i++;
      
             }
            }
            if(!found){
            System.out.println("Not Found"); 
        }
}
    }