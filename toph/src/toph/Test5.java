package toph;

import java.util.Scanner;

public class Test5 {
	public static void main(String []args) {
		Scanner inputScanner =new Scanner(System.in);
		System.out.println("请输入今天的星期（1-7）");
		int lv=inputScanner .nextInt();
				switch (lv) {
				case 1:
					System.out.println("你好，星期一的特价菜为水煮鱼");
					break;
				case 2:
					System.out.println("你好，星期二的特价菜为烧排骨");
					break;
				case 3:
					System.out.println("你好，星期三的特价菜为宫保鸡丁");
					break;
				case 4:
					System.out.println("你好，星期四的特价菜为宫保鸡丁");
					break;
				default:
					System.out.println("您好，星期五，星期六，星期天为干锅肥肠");
					break;
				}
				inputScanner.close();
	}
}
