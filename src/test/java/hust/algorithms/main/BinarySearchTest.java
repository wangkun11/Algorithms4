package hust.algorithms.main;

import java.util.Arrays;

import org.junit.Test;

import hust.algorithms.util.MyScanner;

public class BinarySearchTest{
	
	@Test
	public void test() {
		int[] a=MyScanner.getInts(" ",1);				
		Arrays.sort(a);
		System.out.println(BinarySearch.rank(10, a));
	}

}
