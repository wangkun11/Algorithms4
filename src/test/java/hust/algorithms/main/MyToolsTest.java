package hust.algorithms.main;

import org.junit.Test;

import hust.algorithms.sort.QuickSort;
import hust.algorithms.util.MyTools;

public class MyToolsTest extends QuickSort{

	@Test
	public void test() {
		Integer[] a={1,2,3,4,5,6,7,8,9};
		MyTools.shuffle(a);
		show(a);
	}
	
}
