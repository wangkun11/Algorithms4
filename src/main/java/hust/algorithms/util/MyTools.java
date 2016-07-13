package hust.algorithms.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyTools {
	public static <T> void shuffle(T[] t){
		List<T> aList= Arrays.asList(t);
		Collections.shuffle(aList);
		aList.toArray(t);
	}
}
