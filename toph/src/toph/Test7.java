package toph;

import java.util.Scanner;

public class Test7 {
	public static void main(String[]arg) {
		Scanner inputScanner=new Scanner(System.in);
		String pwd="spee";
		String pwd1="1196";
		System.out.println("请输入密码");
		String pwd3=inputScanner.next();
		if (pwd3.equals(pwd)) {
			System.out.println("请输入第二密码");
			String pwd4=inputScanner.next();
			if (pwd4.equals(pwd1)) {
				System.out.println("输入正确");
			}else {
				System.out.println("密码错误");
			}
		}else {
			System.out.println("密码输入错误");
		}
		inputScanner.close();
	}
}
