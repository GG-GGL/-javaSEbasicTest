//�ŵ�����:��һ������,�ӳ��������������ÿ���¶���һ������,С���ӳ����������º�ÿ��������һ������,�������Ӷ�����,��ÿ���µ���������Ϊ����?
import java.util.Scanner;
public class OldQuestion{
	int startNum = 2;
	static int fnum = 0;
	public static int finalNum(int month) {
         if(month==1||month==2) {
        	 return 2;
         }
         else {
             return finalNum(month-1)+finalNum(month-2);	 
         }
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int a = finalNum(month);
		System.out.println("��"+month+"������"+a+"ֻ���ӣ���");
	}
}