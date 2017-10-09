

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {

	public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
	private static void getSubsets(List<Integer> superSet, int k, int idx, ArrayList<Integer> current,List<ArrayList<Integer>> solution) {
	    //successful stop clause
	    if (current.size() == k) {
	        solution.add(new ArrayList<>(current));
	        return;
	    }
	    //unseccessful stop clause
	    if (idx == superSet.size()) return;
	    Integer x = superSet.get(idx);
	    current.add(x);
	    //"guess" x is in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	    current.remove(x);
	    //"guess" x is not in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	}

	public static List<ArrayList<Integer>> getSubsets(List<Integer> superSet, int k) {
	    List<ArrayList<Integer>> res = new ArrayList<>();
	    getSubsets(superSet, k, 0, new ArrayList<Integer>(), res);
	    return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        List<Integer> ar = new ArrayList<Integer>();
        List<ArrayList<Integer>> res = new ArrayList<>();
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            ar.add(arr_i,arr[arr_i]);
        }
        res = getSubsets(ar,4);
        int sum[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            for(int j = 0; j < res.get(i).size(); j++) {
            	sum[i] += res.get(i).get(j);
            	
            }
            
        }
        System.out.println(getMin(sum)+" "+getMax(sum));
        in.close();
	}

}
