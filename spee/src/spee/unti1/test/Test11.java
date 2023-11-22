// 声明一个名为spee.unti1.test的包  
package spee.unti1.test;  
  
// 导入java.util.Scanner类，用于从控制台接收用户输入  
import java.util.Scanner;  
  
// 声明一个名为Test11的公共类  
public class Test11 {  
   
 // 定义一个Scanner对象，用于从控制台接收用户输入  
	 Scanner inputScanner=new Scanner(System.in);  
	   
	 // 提示用户输入存款金额（以万元为单位）  
	 System.out.println("请问年底存款有多少钱了？(万元)"); 
	   
	 // 从控制台接收用户输入的存款金额，并存储在变量money中  
	 double money = inputScanner.nextDouble(); 
	   
	 // 检查存款金额是否为负数，如果是，则输出错误信息并结束程序  
	 if (money < 0) {  
	 System.out.println("存款不能为负数，请重新输入。");  
	 return; // 通过return语句退出程序  
	 }  
	   
	 // 根据存款金额给出不同的建议  
	 if (money>=100) {  
	 System.out.println("买宝马"); // 如果存款大于等于100万元，建议买宝马  
	 } else if (money>=50 && money<100) {  
	 System.out.println("买霸道"); // 如果存款在50万至100万元之间，建议买霸道  
	 } else if (money>=20 && money<50) {  
	 System.out.println("买二手车"); // 如果存款在20万至50万元之间，建议买二手车  
	 } else if (money<20){ // 如果存款小于20万元，进入此分支  
	 // 在这个默认分支中，程序输出"共享单车"作为建议  
	 System.out.println("共享单车"); // 小于20万元的建议是使用共享单车  
	 }  
	   
	 // 关闭Scanner对象，释放资源，避免内存泄露  
	 inputScanner.close();  
	}