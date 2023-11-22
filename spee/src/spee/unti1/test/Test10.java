package spee.unti1.test; // 声明一个名为spee.unti1.test的包  
  
public class Test10 { // 声明一个名为Test10的公共类  
    public static void main(String []args) { // 主方法开始  
        double money=1;//年底存款（初始化一个变量money，值为1）  
        // 判断money的值是否大于等于100  
        if (money>=100) {  
            // 如果money大于等于100，输出"buy car"（买汽车）  
            System.out.println("buy car");  
        } else { // 当money小于100时进入这个分支  
            // 当money小于100时，输出"just do your dream"（做你的梦想）  
            System.out.println("just do your dream");  
        }  
    } // 主方法结束  
} // 类结束