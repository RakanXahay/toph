package toph;

import java.util.Scanner;

public class Test6 {
	public static void main(String []args) {
		Scanner inputScanner =new Scanner(System.in);
		System.out.println("请输入您需要计算的数字");
		double math1=inputScanner.nextDouble();
		System.out.println("请输入您需要计算的第二数字");
		double  math2=inputScanner.nextDouble();
		System.out.println("请输入运算符号");
		String 	a=inputScanner.next();
		switch (a) {
				case "+":
					System.out.println(math1+math2);
			break;
				case "-":
					System.out.println(math1 -math2);
			break;
				case "*":
					System.out.println(math1 *math2);
			break;
				case "/":
					System.out.println(math1 /math2);
				break;
		default:
			System.out.println("请输入正确的值");
			break;
		}
		inputScanner.close();
	}
}
