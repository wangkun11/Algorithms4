package hust.algorithms.sort;
/**
 * 希尔排序（插入排序的升级版）：对插入排序的优化， 使数组中任意间隔h的元素都是有序，避免了插入排序只能相邻交换的弊端，当h为1时即排序结束
 * 时间复杂度：O(N的3/2次方) （由h序列来决定）
 * 空间复杂度：不需要额外空间
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日
 *
 */
public class ShellSort extends Sort {

	@Override
	protected void sort(Comparable[] a) {
		int N=a.length;
		int h=1;
		while (h<N/3) {
			h=3*h+1;   //1,4,13,40,121,364,1093	
		}
		while (h>=1) {
			for (int i = h; i < N; i++) {
				//隔着h个元素进行交换，保证排序完后为h有序，当h递减为1时，则整体有序了
				for (int j = i; j >=h&&less(a[j], a[j-h]); j-=h) {
					exchange(a, j, j-h);
				}
				
			}
			h=h/3;  //h会由最初值（假设为40）逐步递减到1，那么40、13、4、1被称为h序列
		}
	}

}
