// 声明一个名为spee.unti1.test的包（package）  
package spee.unti1.test;  
  
// 声明一个名为Test6的公共类  
public class Test6 {  
    // 定义程序的入口方法main，参数为一个字符串数组  
    public static void main(String [] args) {   
        // 定义一个双精度浮点型变量weight并赋值为137.5  
        double weight=137.5;  
        // 定义一个整型变量rise并赋值为10  
        int rise=10;  
        // 打印weight和rise的和，结果为147.5  
        System.out.println(weight+rise);  
          
        // 定义一个双精度浮点型变量money并赋值为1203.9  
        double money=1203.9;  
        // 定义一个整型变量pick并赋值为100  
        int pick=100;  
        // 定义一个整型变量total，它是将money强制转换为int类型后与pick相加得到的，结果为1303  
        int total=(int)money+pick;  
        // 打印变量total的值，结果为1303  
        System.out.println(total);  
    }  
}