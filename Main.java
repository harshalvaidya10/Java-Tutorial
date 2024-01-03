import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean t = rotateMatrix(matrix);

        if(t)
        {
            for(int i = 0 ; i < matrix.length ; i++)
            {
                for(int j = 0 ; j < matrix[0].length ; j++)
                {
                    System.out.print(matrix[i][j]);
                }

                System.out.println();
            }
        }

    }

    static boolean rotateMatrix(int[][] matrix) {
        
       
        
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            int temp = 0;
            for(int j = 0; j < matrix[0].length ; j++)
            {
                   temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                
                
            }
        }
        
        
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            int temp1 = 0;
            int k = matrix[0].length - 1;
           for(int j = 0 ; j < matrix[0].length/2 ; j++)
           {
                temp1 = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp1;
                k--;
           }
        }
        
        
      return true;  
        
       
       
    }
}



