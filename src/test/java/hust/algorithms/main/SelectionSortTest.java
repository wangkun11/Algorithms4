package hust.algorithms.main;

import org.junit.Test;

import hust.algorithms.sort.SelectionSort;
import hust.algorithms.util.MyScanner;

public class SelectionSortTest extends SelectionSort{

	@Test
	public void testSort() {
		//fail("Not yet implemented");
		Integer[] a=MyScanner.getIntegers(" ", 1);
		show(a);
		sort(a);
		show(a);
	}

}
