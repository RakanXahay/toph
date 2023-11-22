// 声明一个名为spee.unti1.test的包（package）  
package spee.unti1.test;  
  
// 声明一个名为Test7的公共类  
public class Test7 {  
    // 定义程序的入口方法main，参数为一个字符串数组  
    public static void main(String []args) {   
        // 定义一个整型变量a1并赋值为10  
        int a1=10;  
        // 定义一个双精度浮点型变量a2并赋值为3.14  
        double a2=a2=3.14;  
        // 打印括号内的运算结果，即(a1+2-3)*6，结果为42  
        System.out.println((a1+2-3)*6);  
        // 打印a1除以3的结果，结果为3.3333333333333335  
        System.out.println(a1/(double)3);  
        // 打印a2取模1的结果，结果为0.14285714285714285  
        System.out.println(a2%1);  
        // 对a1增加1，即a1=a1+1  
        a1++;  
        // 对a2减少1，即a2=a2-1  
        a2--;  
        // 打印a1和a2的和，结果为13.14  
        System.out.println(a1+a2);  
        // 定义两个整型变量c1和c2并都赋值为7  
        int c1=7;  
        int c2=7;  
        // 打印c1和c2是否相等的结果，结果为true  
        System.out.println(c1==c2);  
        // 打印c1和c2是否不相等的结果，结果为false  
        System.out.println(c1!=c2);  
        // 定义两个整型变量d1和d2并分别赋值为8和6  
        int d1=8;  
        int d2=6;  
        // 打印d1是否小于10且d2是否大于等于5的结果，结果为true  
        System.out.println(d1<10 && d2>=5);  
        // 打印d1是否小于5或d2是否大于等于9的结果，结果为true  
        System.out.println(d1<5 || d2>=9);  
        // 打印d1是否不小于3的结果，结果为false  
        System.out.println(!(d1>3));  
        // 定义一个整型变量age并赋值为30  
        int age=30;  
        // 根据age的值判断年龄段并创建一个字符串s，如果age小于等于30，s的值为"中年"，否则s的值为"青年"  
        String s=age<=30?"中年":"青年";  
        // 打印字符串s的值，结果为"中年"  
        System.out.println(s);  
    }  
}