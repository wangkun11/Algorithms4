package hust.algorithms.sort;

/**
 * 
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日 * 
 * 时间复杂度：O(N的平方)
 * 空间复杂度：不需要额外空间
 * 插入排序：对于有序数组很有效，而对于大规模乱序数组则很慢，因为他只会交换相邻位置的元素，所以元素只能一点点的从数组的一端移动到另一端
 */
public class InsertionSort extends Sort{

	@Override
	protected void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j >0&&less(a[j], a[j-1]); j--) {
				//当后面的元素比前一个小，则交换位置
				exchange(a, j, j-1);
			}
		}
	}

}
