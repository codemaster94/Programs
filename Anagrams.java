import java.util.Scanner;

public class Anagrams {

	public static int numberNeeded(String first, String second) {
	   int result = 0;
	   int count1[] = new int[26];
	   int count2[] = new int[26];
	   for(int i=0 ; i < first.length(); i++) {
		   count1[first.charAt(i) - 'a']++;
	   }
	   for(int i=0 ; i < second.length(); i++) {
		   count2[second.charAt(i) - 'a']++;
	   }
	   for(int i = 0; i < 26; i++) {
		   if((count1[i] - count2[i]) < 0)
				  result += count2[i] - count1[i];
		   else
			   result += count1[i] - count2[i];
	   }
	   return result;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	        in.close();
	}

}
