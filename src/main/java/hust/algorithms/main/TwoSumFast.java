package hust.algorithms.main;

import java.util.Arrays;

/**
 * 2-sum问题
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年6月16日
 *
 */
public class TwoSumFast {
	public static int count(int[] a) {
		int count = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (BinarySearch.rank(-a[i], a)>i) {
				count++;
			}
		}
		return count;
	}
}
