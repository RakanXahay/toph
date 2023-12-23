package bbno;  
  
public class Test3 {  
    public static void main(String[] args) {  
        int nian = 1;  
        double all = 0; 
        double ac=20;
        double money=2;
        while (nian <= 10) {  
        	all=all+money;
        	ac=ac-money;
        	System.out.println("第"+nian+"年还款1.2万元,累计还款"+all+"还剩"+ac+"万元未还");
            nian++;  
        }  
    }  
}