import java.util.Arrays;
//某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
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
