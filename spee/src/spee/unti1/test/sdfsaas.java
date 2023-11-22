// 导入 java.util 包中的 Scanner 类，使得程序可以使用 Scanner 对象从控制台获取用户输入  
package spee.unti1.test;  
  
import java.util.Scanner;  
  
// 定义一个名为 UserInput 的公共类  
public class sdfsaas {  
  
    // 定义程序的入口方法 main  
    public static void main(String[] args) {  
          
        // 创建一个 Scanner 对象，并将其命名为 input，用于从控制台获取用户输入  
        Scanner input = new Scanner(System.in); // 只需要创建一次  
          
        // 打印一条提示消息，告诉用户需要输入年龄和身高  
        System.out.println("请输入您的年龄和身高，例如（身高是184和体重为196斤），请按照顺序");  
          
        // 使用 input 对象从控制台获取用户输入的年龄，并将其赋值给变量 age  
        int age = input.nextInt();  
          
        // 使用 input 对象从控制台获取用户输入的身高，并将其赋值给变量 height  
        int height = input.nextInt();  
          
        // 打印一条消息，显示用户输入的年龄和身高  
        System.out.println("您的年龄是 " + age + "岁，身高是 " + height + "厘米。");  
    }  
}