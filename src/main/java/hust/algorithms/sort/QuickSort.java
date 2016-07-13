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
	}
	private void sort(Comparable[] a ,int low,int high){
		if(high<=low) return;
		
	}

}
