package bbno;

import java.util.Scanner;


public class Test6 {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		double max=0;
		double smll=0;
		int i =1;
		double sum=0;
		double avg=0;
		while (i<=10) {
			System.out.println("第"+i+"次输入分数");
			double lv=inputScanner.nextDouble();
			sum+=lv;
			if (i==1) {
				max=lv;
				smll=lv;
			}else if (lv>max) {
					max=lv;
				}else if (lv<smll) {
					smll=lv;
				}
			avg=sum/i;
			i++;
			}
		System.out.println("最大值为"+max+"，最小值为"+smll+",求和的值为"+sum+"平均分数为"+avg);
		inputScanner.close();
	}
}
	