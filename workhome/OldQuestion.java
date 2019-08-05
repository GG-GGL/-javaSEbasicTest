//古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?
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
		System.out.println("第"+month+"个月有"+a+"只兔子！！");
	}
}