// 声明一个名为spee.unti1.test的包（package）  
package spee.unti1.test;  
  
// 引入java的Scanner类，该类用于从用户获取输入  
import java.util.Scanner;   
  
// 声明一个名为Test8的公共类  
public class Test8 {  
    // 定义程序的入口方法main  
    public static void main(String[] args) {   
          
        // 创建一个Scanner对象，用于从System.in获取用户输入，并将其赋值给input变量  
        Scanner input = new Scanner(System.in);   
          
        // 打印提示消息，让用户输入年龄，年龄范围为0-100  
        System.out.println("请输入您的年龄(0~100)");   
          
        // 从用户输入中读取一个整数并存储在a变量中  
        int a = input.nextInt();   
          
        // 打印提示消息，让用户输入身高  
        System.out.println("请输入您的身高");   
          
        // 从用户输入中读取一个双精度浮点数并存储在height变量中  
        double height = input.nextDouble();   
          
        // 打印用户的年龄  
        System.out.println("您的年龄是" + a);   
          
        // 打印用户的身高  
        System.out.println("您的身高是" + height);   
          
        // 这里再次创建了两个Scanner对象，这是不必要的，建议删除这两行并使用input变量来获取后续的输入。  
//      double a1 = input.nextDouble(); // 从用户输入中读取一个双精度浮点数并存储在a1变量中，但这里并没有使用a1。建议删除此行。  
//      double b = input.nextDouble(); // 从用户输入中读取一个双精度浮点数并存储在b变量中，但这里并没有使用b。建议删除此行。  
          
        // 这里可以继续使用input变量来获取用户的输入，例如：让用户再次输入两个数字并相加。  
//      System.out.println(a1 + b); // 打印两个数字的和，但这里a1和b的值并没有给出，所以这行代码可能会出现问题。建议根据需求修改。如果要使用之前的a和height，则应更改为 System.out.println(a + height);   
    }  
}