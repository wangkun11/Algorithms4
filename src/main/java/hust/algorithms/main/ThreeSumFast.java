package hust.algorithms.main;

import java.util.Arrays;

/**
 * 3-sum问题 
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年6月16日
 *
 */
public class ThreeSumFast {
	public static int count(int[] a) {
		int count = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) break;
			int low=i+1,high=a.length-1;
			int sum=0;
			while (high>low) {
				sum=a[i]+a[low]+a[high];
				if (sum<0) {
					low++;
				}else if(sum>0){
					high--;
				}else {
					count++;
					System.out.println(a[i]+" "+a[low]+" "+a[high]);
					low++;
					high--;
				}
			}
		}
		return count;
	}
}
