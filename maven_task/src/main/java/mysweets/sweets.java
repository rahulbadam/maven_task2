package mysweets;


import java.util.Map;
import java.util.TreeMap;

public abstract class sweets
{
	public static TreeMap<String, Integer> sweet = new TreeMap<String,Integer>();	
	public abstract void setdetails(String name,int weight);	
	public void byname()
	{

 		 System.out.println(sweet.keySet());
	}
	public  void byweight()
	{
		 TreeMap<Integer,String> wtmap=new TreeMap<Integer,String>();
		for(Map.Entry<String,Integer> entry : sweet.entrySet()) {
			  String key = entry.getKey();
			  Integer value = entry.getValue();
			  wtmap.put(value,key);
			  
			}
		System.out.println(wtmap.values());
		
	}
	public void totalweight()
	{int sum=0;
		for(Map.Entry<String,Integer> entry : sweet.entrySet()) {

			  Integer value = entry.getValue();
			  sum+=value;
			}
		System.out.println(sum);

		
	}
    }





