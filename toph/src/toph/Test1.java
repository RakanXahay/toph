// 声明一个名为 toph 的包  
package toph;  
  
// 导入 Java 的 Scanner 类，用于从控制台读取用户输入  
import java.util.Scanner;
// 声明一个名为 Test1 的公共类  
public class Test1 {  
    // 主方法，Java 程序的入口点  
    public static void main(String []argS) {  
        // 创建一个 Scanner 对象，用于读取控制台输入  
        Scanner inputScanner=new Scanner(System.in);  
          
        // 打印提示消息，要求用户输入星期几（1-7）  
        System.out.println("请输入星期几(1-7)");  
          
        // 从控制台读取用户输入的整数，并存储在变量 date 中  
        int date=inputScanner.nextInt();  
          
        // 使用 if-else 语句根据用户输入的数字进行判断并输出对应的星期几  
        if (date==1) {  
            System.out.println("星期一");  
        }else if (date==2) {  
            System.out.println("星期二");  
        }else if (date==3) {  
            System.out.println("星期三");  
        }else if (date==4) {  
            System.out.println("星期四");  
        }else if (date==5) { // 添加对5-7的输入处理  
            System.out.println("星期五");  
        }else if (date==6) {  
            System.out.println("星期六");  
        }else if (date==7) { // 添加对7的输入处理  
            System.out.println("星期日");  
        }else { // 处理非法输入（例如不是数字或者超出范围）  
            System.out.println("输入错误，请输入1-7之间的数字");  
        }  
        inputScanner.close();
    }  
}