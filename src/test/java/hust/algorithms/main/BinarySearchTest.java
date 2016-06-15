package hust.algorithms.main;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import hust.algorithms.util.MyScanner;

public class BinarySearchTest {

	
	@Test
	public void test() {
		ArrayList<String> a=MyScanner.getStrings(1,null,1);
		int[] b=new int[a.size()];
		for (int i = 0; i < b.length; i++) {
			b[i]=Integer.valueOf(a.get(i));
		}
		BinarySearch.rank(10, b);
	}

}
