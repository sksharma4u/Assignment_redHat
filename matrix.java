// ----------------------------------------------------------------------------------------------------------------
// Program to transpose two matrices (4X4) and print the multiplication of
// the transposed matrices.
// ---------------------------------------------------------------------------------------------------------------


// --------------------------
// Time Complexity:  O(n^3)
// Space Complexity: O(n^2)
// --------------------------

import java.util.*;
import java.lang.*;
import java.io.*;


class matrix
{

    static int[][] Transpose(int M[][],int n) {
        
        int[][] M_Trans = new int[n][n];  
		
        for(int i=0; i<n ; i++){
			for(int j=0; j<n ; j++){
				M_Trans[j][i] = M[i][j];
			}
		}
		
		return M_Trans;
    }
    

     static void Multiplication(int M1[][] , int M2[][] , int n ){
        
        int res[][] = new int[n][n];
		
		
		for(int i=0; i<n; i++){
			for(int j =0 ; j<n ; j++){

				for(int k=0; k<n ; k++){
					res[i][j] = res[i][j] + M1[i][k] * M2[k][j];
				}
			}
		}
		
		display(res , n);
		
    }

    
    static void display(int res[][] , int n){
        
        	for(int i=0; i<n ; i++){
    			for(int j=0; j<n ; j++){
    				System.out.print(res[i][j] +" ");
    			}
			    System.out.println();
		}
		
    }
    
   
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int[][] A = { {1, 2, 3, 4}, {5, 6, 7 ,8}, {9 ,10 ,11 ,12}, {13 ,14 ,15 ,16} };
        	int[][] B = { {5, 6, 7, 8}, {1, 4, 3 ,6}, {1, 2, 1, 3}, {4 ,5 ,7 ,9} };
		
		int n = A.length;
		
		
        	int Matrix_M1[][] = Transpose(A , n);	
        	int Matrix_M2[][] = Transpose(B , n);	
        
        
        
        	Multiplication(Matrix_M1 , Matrix_M2 , n);

		
	}
}