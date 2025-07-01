public class question42 {
    public static void main(String[] args) {
      int [][] matrix = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
      };

      int n = matrix.length;

      System.err.println("Main Diagonal:");
      for(int i = 0; i<n; i++) {

      System.out.print(matrix[i][i] + " ");
      }
      System.out.println();

      System.out.println("secondary Diagonal:");
      
      for(int i = 0; i < n; i++){
         System.out.println(matrix[i][n-1-i] + " ");
      }
      System.out.println();


    }
    
}
