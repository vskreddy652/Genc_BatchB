import java.util.*;

public class ArrayLinkedListEg {
public static void main(String[] args) {
	ArrayList<LinkedList<String>> allst = 
			new ArrayList<LinkedList<String>>();
	
	LinkedList<String> lls1 = new LinkedList<String>();
	lls1.add("llst1");
	lls1.add("llst2");
	lls1.add("llst3");
	
	LinkedList<String> lls2 = new LinkedList<String>();
	lls2.add("llst4");
	lls2.add("llst5");
	lls2.add("llst6");
	
	allst.add(lls1);
	allst.add(lls2);
	
	Iterator<LinkedList<String>> ills = allst.iterator();
	
	while(ills.hasNext())
	{
		LinkedList<String> llsw = ills.next();
		
		Iterator<String> is = llsw.iterator();
		
		while(is.hasNext())
		{
			System.out.print(is.next()+"\t");
		}
		
		System.out.println();
	}
	
	//System.out.println(allst);
}
}
