//有n个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),凡报道3的人退出圈子,问最后留下的是原来第几号的那位
import java.util.Scanner;
public class Sort{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		int a =0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0;i<num;i++) {
			if(num>=9) {
			num = num-9;
			b++;
			System.out.println((b*9+1)+"   "+(b*9+2));
			}
		}
		
		
	}
}