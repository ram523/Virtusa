
/******************************************************************************

problem 3.
   HashMap with renum as key and mark as value find the avg of marks whose key is odd.
   input :{12:90,35:90,56:88}
   output : (90+90) =90

*******************************************************************************/
import java.util.*;
public class OddRegNumMarksAvg
{
 static Map<Integer,Integer> h=new HashMap<Integer,Integer>();
	public static void main(String[] args) {
	    h.put(11,90);
	    h.put(35,90);
	    h.put(56,88);
	    int c=0,sum=0;
	    Set<Integer> s=h.keySet();
	    for(Integer i:s)
	    {
	        if((int)i%2!=0)
	        {
	          sum=sum+(int)h.get(i);
	          c++;
	        }
	    }
	     System.out.println(h);
	     System.out.println(sum/c);
	     
	}
}
