package hust.algorithms.util;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author 华中科技大学 王坤（377816164@qq.com） 2016年6月15日
 *  
 * 封装控制台输入流
 */
public class MyScanner {

	/**
	 * 将固定行数的输入流解析为字符串数组
	 * @param type 输入流类型：1 控制台 2 文件
	 * @param separator 每一行内部的分割副
	 * @param lines 行数
	 * @return
	 */
	public static ArrayList<String> getStrings(int type, String separator, int lines) {
		
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> strings=new ArrayList<String>();
		for (int i = 0; i < lines; i++) {
			String lineString=scanner.nextLine();
			String[] strings2=lineString.split("separator");
			for (String string : strings2) {
				strings.add(string);
			}
		}
		return strings;
	}
	
}
