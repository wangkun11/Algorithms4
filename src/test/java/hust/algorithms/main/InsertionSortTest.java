package hust.algorithms.main;

import static org.junit.Assert.*;

import org.junit.Test;

import hust.algorithms.sort.InsertionSort;
import hust.algorithms.util.MyScanner;

public class InsertionSortTest extends InsertionSort{

	@Test
	public void testSort() {
		//fail("Not yet implemented");
		Integer[] a=MyScanner.getIntegers(" ", 1);
		show(a);
		sort(a);
		show(a);
	}


}
