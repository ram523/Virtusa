/******************************************************************************

 2 . ArrayList of String type which has name#mark1#mark2#mark3 format
   retrive the name of the student who has scored max marks.
   input : {"arun#12#12#12","deepak#13#12#12"}
    Hint : Map<String,Integr> l1=new HashMap<String,Integr>();
*******************************************************************************/
import java.util.*;
public class HighestScoreStudent
{
    static List<String> l=new ArrayList<String>();
    
    static Map<String,Integer> m=new HashMap<String,Integer>();
    
    public static Map<String,Integer> seperatorString()
    {
        for(String s:l)
        {
            String s1=(String)s;
            s1=s1.replace("#"," ");
            String[] str = s1.split(" ");
            int marks=Integer.parseInt(str[1])+Integer.parseInt(str[2])+Integer.parseInt(str[3]);
            m.put(str[0],marks);
          
        }
        return m;
    }
	public static void main(String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     l.add("arun#12#12#12");
	     l.add("deepak#13#12#12");
	     System.out.println(seperatorString());
	     String str="";
	     int max=0;
	     Set s=m.entrySet();
	     Iterator itr=s.iterator();
	     while(itr.hasNext())
	     {
	         Map.Entry i=(Map.Entry)itr.next();
	         if((int)i.getValue()>max)
	         {
	             max =(int)i.getValue();
	             str=(String)i.getKey();
	         }
	     }
	     System.out.println(str+"  "+max);
	     
	  
	}
}