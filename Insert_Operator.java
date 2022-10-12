// --------------------------------------------------------------------------------
// Insert + or - signs anywhere between the digits 123456789 in such a way that the
// expression evaluates to 100. The order of the digits must not be changed.
// Sample solution: 1 + 2 + 3 - 4 + 5 + 6 + 78 + 9 = 100.
//----------------------------------------------------------------------------------

//-------------------------
// Time Complexity: O(c)
// Space Complexity: O(1)
//-------------------------

import java.util.*;
import java.lang.*;
import java.io.*;


class Insert_Operator
{
	static int findnumber(int i,int j)
	{
	
		int n =0;
		
		for(int k = 0; k < j; k++)
		{
			n = i % 3;
			i = i / 3;
		}
		
		return n;
		
	}
	

	public static void main (String[] args) throws java.lang.Exception
	{
		int i, j, k, current, result;
		int operation =0 ;

		for(i = 0; i < 19683; i++)
		{
			if(i%3 == 0){
				continue;
			}
			
			current = 0;
			result = 0;
		
			
			for(j = 1; j < 10; j++)
			{
				k = findnumber(i,j);
				
				if(k==0)
				{
					current = current * 10 + j;
				}
				else
				{
					result = result + (operation == 1 ? current : -current);
					current = j;
					operation = k;
				}
			}
			
			
			result = result + (operation == 1 ? current : -current);
			
			if(result == 100)
			
			{
				
				for(j = 1; j < 10; j++)
				{
					k = findnumber(i,j);
					if(k==0)
						System.out.print(j);
					else{
						System.out.print(k==1?'+':'-');
						System.out.print(j);
					}
					
				}
				
				System.out.println();
			
			}
		}

		
	}
}

