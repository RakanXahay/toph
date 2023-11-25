package toph;

import java.util.Scanner;

public class Test8 {
	public static void main(String []args) {
		Scanner inputScanner=new Scanner(System.in);
		String id="1001";
		double price1=13.5;
		String name1="苹果";
		
		String id1="1002";
		double price2=17.5;
		String name2="面包";
		
		String id2="1003";
		double price3=14.5;
		String name3="牛奶";
		
		double price=0;
		String pname="damkdm";
		
		System.out.println("请输入商品的编号");
		String pid=inputScanner.next();
		if (id.equals(pid)) {
			price=price1;
			pname=name1;
			System.out.println("您查询的商品为"+pname);
		}else if (id1.equals(pid)) {
			price=price2;
			pname=name2;
			System.out.println("您查询的商品为"+pname);
		}else if (id2.equals(pid)) {
			price=price3;
			pname=name3;
			System.out.println("您查询的商品为"+pname);
		}else {
			System.out.println("您输入的商品编号有误，请重新提交");
		}
		System.out.println("您想买多少件");
			int much=inputScanner.nextInt();
			double jine=much*price;
				System.out.println("您所买的商品"+pname+"的金额为"+jine);
				System.out.println("请输入付款金额");
				double pay=inputScanner .nextDouble();
				if (pay>jine) {
					System.out.println("找您"+(pay-jine)+"元");
				}else {
					System.out.println("您的余额不足，还需要"+(jine-pay)+"元");
				}
		inputScanner.close();
	}
}
