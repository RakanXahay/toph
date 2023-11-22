package spee.unti1.test; // 定义了程序的包名为spee.unti1.test  
  
import java.util.Scanner; // 导入了Java的Scanner类，用于从用户获取输入  
  
public class Test9 { // 定义了一个名为Test9的公共类  
  
    public static void main(String []args) { // 定义了程序的入口方法main  
  
        Scanner input=new Scanner(System.in); // 创建一个Scanner对象，用于从System.in获取用户输入  
  
        System.out.println("请输入第一个数"); // 打印提示消息，让用户输入第一个数  
        double num1=input.nextDouble(); // 从用户输入中读取第一个数并存储在num1变量中  
  
        System.out.println("请输入第二个数"); // 打印提示消息，让用户输入第二个数  
        double num2=input.nextDouble(); // 从用户输入中读取第二个数并存储在num2变量中  
  
        System.out.println("您运算的结果为"+(num1+num2)); // 打印两个数的和  
  
        System.out.println("请输入您的年龄"); // 打印提示消息，让用户输入年龄  
  
        System.out.println("请输入您所求圆形的半径"); // 打印提示消息，让用户输入圆形的半径  
        double wa=input.nextDouble(); // 从用户输入中读取圆的半径并存储在wa变量中  
  
        System.out.println("您所求圆的周长"+(wa*3.14)); // 打印圆的周长，计算公式为半径乘以2π，这里用3.14作为π的近似值  
    }  
}