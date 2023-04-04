package week2.day1;

public class Reversestring {
	
	
	public static void main(String[] args) {
		String name = "Ramya";
		char [] reversename = name.toCharArray();
		for (int i = reversename.length-1;i>=0;i--)
		{
			System.out.print(reversename[i]);
		}
	}

}
