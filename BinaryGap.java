import java.util.*;

class Solution {
    public static int solution(int N) {
        // write your code in Java SE 8
        int binaryGap = 0;
	    String binaryString = Integer.toBinaryString(N);
	    char[] characters = binaryString.toCharArray();
	    int j = 0;
	    Character c;
	    for (int i = 0; i < characters.length; i++) {
	         c = characters[i];
	        if (c.equals('0')) {
	            j += 1;
	        }

	        if (c.equals('1')) {
	            if (j > binaryGap ){
	                binaryGap = j;
	            }
	            j = 0;
	        }

	    }
	    return binaryGap;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
		sc.close();
	}
}
