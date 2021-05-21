/******************************************************************************
 Problem 4:
  create a program to get the HashMap from the given input String array where the 
  key for the hashmap.
 input : {"goa","kerala","gujarat"}
 oupput :{GOA=goa,KER=kerala,GUJ=gujarat}

*******************************************************************************/
import java.util.*;
public class FisrtThreeLettersCap
{
   static Map<String,String> m=new HashMap<String,String>();
    
	public static void main(String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     String[] str={"goa","kerala","gujarat"};
	     for(String s:str)
	     {
	         
                if(s.length()<3) s=s+" "+" "+" ";
	        String s1=s.substring(0,3);
	        s1=s1.toUpperCase();
	        m.put(s1,s.trim());
	     }
	     System.out.println(m);
	     
	}
}