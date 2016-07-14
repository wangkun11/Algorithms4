package hust.algorithms.sort;

import hust.algorithms.util.MyTools;

/**
 * 快速排序：先打乱顺序，然后选择一个数组元素，将小于它的放到左边，大于它的放到右边，并递归
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日
 *
 */
public class QuickSort extends Sort {

	@Override
	protected void sort(Comparable[] a) {
		MyTools.shuffle(a);//乱序：消除输入依赖
		sort(a, 0, a.length-1);
	}
	private void sort(Comparable[] a ,int low,int high){
		/**
		 * 此处可以替换为：（M的最佳值与系统相关）
		 * if(hi<=low+M)
		 * {
		 *     InsertionSort.sort(a,low,high);
		 *     return;
		 * }
		 * 在排序数组较小时，切换到基本排序算法，以避免过多的迭代
		 */
		if(high<=low) return;
		
		int j=partition(a, low, high);   //切分
		//左右两部分再迭代排序
		sort(a,low,j-1);   
		sort(a, j+1, high);
	}
}
