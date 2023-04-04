package week2.day1;

public class duplicate{

	public static void main(String[] args) {
		{
			int num[] = {12,24,36,48,60,12,34,24,89,100};

			for(int i=0;i<num.length;i++){
				for (int j=i+1;j<num.length;j++){
				
					if (num[i]==num[j]){
						System.out.println("dup num : " + num[i]);
					}
				}
			}
		}
	}
}