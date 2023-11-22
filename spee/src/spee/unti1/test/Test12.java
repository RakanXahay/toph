// 声明一个名为spee.unti1.test的包  
package spee.unti1.test;  
  
// 导入java.util.Scanner类，用于从控制台接收用户输入  
import java.util.Scanner;  
  
// 声明一个名为Test12的公共类  
public class Test12 {  
   
 // 定义一个Scanner对象，用于从控制台接收用户输入  
 Scanner inputScanner=new Scanner(System.in);  
   
 // 定义一个字符串变量userName，用于存储预设的用户名  
 String userName="zhangsan";  
   
 // 定义一个字符串变量userPwd，用于存储预设的密码  
 String userPwd="123abc";  
   
 // 提示用户输入用户名  
 System.out.println("请输入用户名");  
   
 // 通过Scanner对象inputScanner接收用户输入的用户名，并存储在字符串变量uName中  
 String uName=inputScanner.next();  
   
 // 提示用户输入密码  
 System.out.println("请输入你的密码");  
   
 // 通过Scanner对象inputScanner接收用户输入的密码，并存储在字符串变量pwd中  
 String pwd=inputScanner.next();  
   
 // 使用if语句判断用户输入的用户名和密码是否与预设的用户名和密码相匹配  
 if (userName.equals(uName) && userPwd.equals(pwd)) {  
   
 // 如果用户名和密码都匹配，则打印"登录成功"  
 System.out.println("登陆成功");  
   
 }  
   
 // 如果用户名或密码不匹配，则执行下面的代码块  
 else {  
   
 // 提示用户他们输入的用户名和密码是错误的  
 System.out.println("您输入的账户密码有误，请确保您输入的账户密码无误");  
   
 }  
   
 // 关闭Scanner对象，释放资源，避免内存泄露  
 inputScanner.close();  
}