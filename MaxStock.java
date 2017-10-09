package hackerRank;

import java.util.Scanner;

public class MaxStock {

	static int max(int a, int b) {
		return (a>b)?a:b;
	}
	static long buyMaximumProducts(int n, long k, int[] a) {
        // Complete this function
		long count = 0, sum = 0;
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			b[i] = i+1;
		}
		for(int i = 0; i < n; i++) {
			int l = i+1;
			int s = i;
			//System.out.println("in for "+l);
			while(b[s] > 0 && sum < k) {
					sum = sum + 1*a[s];
					count = count + 1;
					b[s] = b[s] - 1;
					int max = max(b[s]*a[s],b[--s]*a[s]);
					//if(max)
						
					
					//System.out.println("in if "+l+" sum = "+sum+" count ="+count);
							
				}
				
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
	}

}
