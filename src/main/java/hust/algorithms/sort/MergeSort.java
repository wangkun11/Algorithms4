package hust.algorithms.sort;
/**
 * 归并排序（自顶向下）：从上往下依次平分数组，直到不能再分然后再执行归并操作（merge方法），可以将其具体过程想象成一颗二叉树
 * 时间复杂度：O(N*lgN)(1/2N*lgN~N*lgN)
 * 空间复杂度：N (由于在递归调用之前一次性分配了辅助数组的空间)
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日
 *
 */
public class MergeSort extends Sort {

	private Comparable[] tempa;//归并时所需的辅助数组
	@Override
	protected void sort(Comparable[] a) {
		tempa=new Comparable[a.length];//一次性分配辅助数组所需空间
		sort(a,0,a.length-1);
	}
	protected void sort(Comparable[] a,int low,int high) {
		if(high<=low){
			return;
		}
		int mid=low+(high-low)/2;
		sort(a, low, mid);   //左半边排序
		sort(a, mid+1, high);//右半边排序
		if (less(a[mid], a[mid+1])) {
			//优化：如果a[mid]<a[mid+1],则已经是有序的了，就不用归并
			return;
		}
		merge(a, tempa, low, mid, high);//将结果归并
	}
}
