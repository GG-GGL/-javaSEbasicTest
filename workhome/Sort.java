//��n����Χ��һȦ,˳���ź�,�ӵ�һ���˿�ʼ����(��1��3����),������3�����˳�Ȧ��,��������µ���ԭ���ڼ��ŵ���λ
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