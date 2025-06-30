public class question41 {
   public static void main(String[] args) {
     int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
         };

         int rows = matrix.length;
         int cols = matrix[0].length;
         
         boolean[] row = new boolean[rows];
         boolean[] col =  new boolean[cols];

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               if(matrix[i][j] == 0){
                  row[1] = true;
                  col[1] = true;
               }
            }
         }
            for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               if(row[i] || col[j]){
                  matrix[i][j] = 0;
               }
            }
         }
            for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            }
    
}
}
