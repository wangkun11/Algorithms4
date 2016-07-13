package hust.algorithms.sort;

public abstract class Sort {
	/**
	 * 排序抽象方法
	 * 
	 * @param a：待排序的数组，必须实现了Comparable接口（元素可比较）
	 */
	protected abstract void sort(Comparable[] a);

	/**
	 * 返回数字中两个元素的大小关系
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	protected boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换位置
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	protected void exchange(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	/**
	 * 打印数组
	 * 
	 * @param a
	 */
	protected void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}

	protected boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
	//原地归并的抽象
	protected void merge(Comparable[] a,Comparable[] tempa,int low ,int mid,int high){
		int i=low,j=mid+1;
		for (int k = low; k <=high; k++) {//先复制到临时空间中去，然后按照顺序回填到原数组
			tempa[k]=a[k];
		}
		for (int k = low; k <=high; k++) {
			if (i>mid) {//左半边取完，直接取右边元素
				a[k]=tempa[j++];
			} else if(j>high){//右半边取完，直接取左边元素
				a[k]=tempa[i++];
			}else if (less(tempa[j], tempa[i])) {//两边都有元素。比较大小，取较小
				a[k]=tempa[j++];
			}else {
				a[k]=tempa[i++];
			}
		}
	}
}
