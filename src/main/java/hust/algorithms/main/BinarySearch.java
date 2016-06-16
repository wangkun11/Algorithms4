package hust.algorithms.main;
/**
 * 二分查找算法
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年6月16日
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param k:需要查找的整数
	 * @param a:待查找的数组，必须排好序
	 * @return
	 */
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
