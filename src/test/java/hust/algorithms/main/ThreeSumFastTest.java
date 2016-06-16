package hust.algorithms.main;

import org.junit.Test;

import hust.algorithms.util.MyScanner;

public class ThreeSumFastTest {

	@Test
	public void test() {
		int[] a=MyScanner.getInts(" ",1);				
		System.out.println(ThreeSumFast.count(a));
	}

}
