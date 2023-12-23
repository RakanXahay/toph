package bbno;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner inputsScanner=new Scanner(System.in);
		int i=1;
		int smll=0;
		int maxgae=0;
		while (i<=5) {
			System.out.println("请输入第"+i+"个年龄");
			int age=inputsScanner.nextInt();
			if (i==1) {
				smll=age;
			}else {
				if (age<smll) {
					smll=age;
					}else {
						if (age>maxgae) {
							maxgae=age;
						}
					}			
				}
			i++;
			}
		System.out.println("最小值为"+smll+"，最大值为"+maxgae);
		inputsScanner.close();
		}
	}

