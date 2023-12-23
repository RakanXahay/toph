package bbno;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		int i=1;
		int maxage=0;
		while (i<=5) {
			System.out.println("第"+i+"次输入年龄");
			int age=inputScanner.nextInt();
			if (i==1) {
				maxage=age;
			}else {
				if (age>maxage) {
					maxage=age;
				}if (i==5) {
					System.out.println("最大值为"+maxage);
				}
			}
			i++;
			}
		inputScanner.close();
		}
		
	}
