package hust.algorithms.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年6月15日
 * 
 *         封装控制台输入流
 */
public class MyScanner {

	/**
	 * 将固定行数的输入流解析为字符串数组
	 * 
	 * @param type
	 *            输入流类型：1 控制台 2 文件
	 * @param separator
	 *            每一行内部的分割副
	 * @param lines
	 *            行数
	 * @return
	 */
	public static ArrayList<String> getStringList(String separator, int lines) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < lines; i++) {
			String lineString = scanner.nextLine();
			String[] strings2 = lineString.split(separator);
			strings.addAll(Arrays.asList(strings2));
		}
		scanner.close();
		return strings;
	}
	public static String[] getStrings(String separator, int lines) {

		ArrayList<String> strings = getStringList(separator, lines);
		String[] strings2=new String[strings.size()];
		for (int i = 0; i < strings2.length; i++) {
			strings2[i]=strings.get(i);
		}
		return strings2;
	}
	/**
	 * 从控制台读取整数型输入数组
	 * 
	 * @param separator
	 * @param lines
	 * @return
	 */
	public static int[] getInts(String separator, int lines) {
		ArrayList<String> a = getStringList(separator, lines);
		int[] b = new int[a.size()];
		for (int i = 0; i < b.length; i++) {
			// System.out.println(a.get(i));
			b[i] = Integer.valueOf(a.get(i));
		}
		return b;
	}
	public static Integer[] getIntegers(String separator, int lines) {
		ArrayList<String> a = getStringList(separator, lines);
		Integer[] b = new Integer[a.size()];
		for (int i = 0; i < b.length; i++) {
			// System.out.println(a.get(i));
			b[i] = Integer.valueOf(a.get(i));
		}
		return b;
	}
}
