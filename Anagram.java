//------------------------------------------------------------------------------------------------------------
// Program to check if two given String is Anagram of each other return true if Input
// string is anagram otherwise return false.
// ----------------------------------------------------------------------------------------------------------


//---------------------------
//Time Complexity  : O(nlogn)
//Space Complexity : O(n)
//---------------------------


import java.util.*;

class Anagram{

    public static boolean isAnagram(String s, String t) {
            
        boolean val = true;
        
        if (s.length() != t.length()) {  
            return false;
        }
 
        char[] A1 = s.toCharArray();  
        char[] A2 = t.toCharArray();  
            
        Arrays.sort(A1);  
        Arrays.sort(A2);  
            
        val = Arrays.equals(A1, A2);  
       
        if (val) {  
            return true;
        }
        
        return false;
        
    }
    public static void main(String[] args){
        
    	boolean res = isAnagram("cat" , "act");
	    System.out.println(res);
	    
   }
}
