import java.util.Arrays;
//ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
import java.util.Scanner;
public class Cipher{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[4];		
		Scanner in = new Scanner(System.in);
		for(int i = 0;i < 4;i++) {
			array[i] = in.nextInt();
		}
		for(int i = 0;i < 4;i++) {
			array[i]+=5;
		}
		for(int i = 0;i < 4;i++) {
			array[i]=array[i]%10;
		}
		int change;
		int change1;
		change = array[0];
		array[0] = array[3];
		array[3] = change;
		change1 = array[1];
		array[1] = array[2];
		array[2] = change1;
		System.out.println(Arrays.toString(array));
	}
}
