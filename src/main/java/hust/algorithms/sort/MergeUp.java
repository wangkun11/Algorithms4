package hust.algorithms.sort;
/**
 * 归并排序（自低向上）：
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年7月13日
 *
 */
public class MergeUp extends Sort {

	@Override
	protected void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		int N=a.length;
		Comparable[] tempa=new Comparable[a.length];
		for (int size = 1; size < N; size*=2) {
			for (int low = 0; low < N-size; low+=size*2) {
				merge(a, tempa, low, low+size-1, Math.min(low+size*2-1, N-1));
			}
		}
	}

}
