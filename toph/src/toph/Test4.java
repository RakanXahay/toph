package toph;

import java.util.Scanner;

public class Test4 {
	public static void main(String []args) {
		Scanner inputScanner =new Scanner(System.in);
		System.out.println("请输入您的会员等级（0-5）");
		int lv=inputScanner .nextInt();
				switch (lv) {
				case 0:
					System.out.println("您是lv.0，不享有此优惠");
					break;
				case 1:
					System.out.println("您是lv.1，享有99折");
					break;
				case 2:
					System.out.println("您是lv.2，享有95折");
					break;
				case 3:
					System.out.println("您是lv.3，享有9折");
					break;
				case 4:
					System.out.println("您是lv.4，享有85折");
					break;
				case 5:
					System.out.println("您是lv.5，享有8折");
					break;
				default:
					System.out.println("请重新提交您的会员等级（0-5）");
					break;
				}
				inputScanner.close();
	}
}
