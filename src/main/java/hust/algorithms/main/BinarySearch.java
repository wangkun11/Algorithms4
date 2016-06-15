package hust.algorithms.main;

public class BinarySearch {


	public static int rank(int k,int[] a){
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid = low+(high-low)/2;
			if (k<a[mid]) {
				high=mid-1;
			}else if(k>a[mid]){
				low=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
}
