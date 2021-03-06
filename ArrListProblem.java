
import java.util.*;
public class ArrListProblem{
	List<Integer> A1=new ArrayList<Integer>();
	List<Integer> A2=new ArrayList<Integer>();
	public List<Integer> storeEvenNumbers(int n)
	{
		for(int i=2;i<=n;i++)
			if(i%2==0)  A1.add(i);
		return A1;
	}
	public List<Integer> printEvenNumbers()
	{
		Iterator<Integer> itr=A1.iterator();
		while(itr.hasNext())
		{
			A2.add(2*(int)itr.next());
		}
		return A2;
	}
	public int retrieveEvenNumber(int n) 
	{
		for(Integer i:A1)
		{
			if((int)i==n)
				return (int)i;
		}
		return 0;
	}

	
}
public Class ArrListDemo
{
    public static void main(String[] args) {
		ArrListProblem obj=new ArrListProblem();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(obj.storeEvenNumbers(n));
		System.out.println(obj.printEvenNumbers());
		System.out.println("enter which element do you want to search in list");
		int m=sc.nextInt();
		System.out.println(obj.retrieveEvenNumber(m));

	}

}
