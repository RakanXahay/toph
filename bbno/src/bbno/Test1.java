package bbno;

public class Test1 {
	public static void main(String[]arg) {
		int nian=1;
		while (nian<=10) {
			if (nian==7) {
				System.out.println("已还清所有贷款");
				nian=11;
			}else {
				System.out.println("第"+nian+"年还钱1.2万元");
				nian++;
			}
		}
	}
		
}
