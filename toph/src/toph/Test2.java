package toph;  
  
import java.util.Scanner;    
    
public class Test2 {    
    public static void main(String[] argS) {    
        Scanner inputScanner = new Scanner(System.in);   
        System.out.println("请输入您消费的金额");
        double money = inputScanner.nextDouble();   
        if (money >= 1000) {    
            System.out.println("赠送电饭锅");  
            System.out.println("请问您是否是会员？（1.是  2.否）");
            int msc=inputScanner.nextInt();
            if (msc==1) {
				System.out.println("恭喜你打九折");
			}
        }
        else if (money >= 500&& money<1000) {    
            System.out.println("赠送榨汁机");    
        } else if (money >= 200&&money<500) {    
            System.out.println("赠送抽纸一提");    
        } else {    
            System.out.println("谢谢惠顾"); 
            System.out.println("欢迎下次光临");
        } 
        inputScanner.close();
    }  // main method end 
}  // Test2 class end