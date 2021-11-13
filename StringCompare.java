package week3.day1;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="I am Learning Java" ;
		String S2="I am learning java?" ; 
		if (S1==S2) 
		{
			System.out.println("STRINGS S1 & S2 USES DIFF MEMORY");
			
		}
		else if (S1.equals(S2)) 
		{
			System.out.println("STRINGS S1 SND S2 IS EQUAL");
			
		}
		else if(S1.equalsIgnoreCase(S2))
		{	
			
		System.out.println("STRINGS ARE EQUAL WITH CASE IGNORE");
		}
		else
		{
			System.out.println("STRINGS ARE NOT EQUAL");
		}
	}

}
