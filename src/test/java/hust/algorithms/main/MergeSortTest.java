package hust.algorithms.main;

import static org.junit.Assert.*;

import org.junit.Test;

import hust.algorithms.sort.MergeSort;
import hust.algorithms.util.MyScanner;

public class MergeSortTest extends MergeSort{

	@Test
	public void test() {
		Integer[] a=MyScanner.getIntegers(" ", 1);
		show(a);
		sort(a);
		show(a);
	}

}
