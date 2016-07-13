package hust.algorithms.sort;
/**
 * 选择排序（又称冒泡排序）：每次为了找到最小元素都必须扫描一次数组。而不能为下次扫描提供任何信息，扫描次数与输入无关，交换次数等于数字大小
 * 时间复杂度：O(N的平方)
 * 空间复杂度：不需要额外空间
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日
 *
 */
public class SelectionSort extends Sort {
	@Override
	protected void sort(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;// 记录当前最小元素的索引
			for (int j = i + 1; j < a.length; j++) {
				if (less(a[j], a[min]))
					min = j;//如果a[j]更小，则改变指针位置
			}
			exchange(a, i, min);//一次遍历完后再交换位置
		}
	}
}
