//求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）
public class Rplus{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 1;
    int b = 100;
    int num = 0;
    for(int i = a;i<=b;i++) {
    	int de = i%10;
    	if(de==3)
    		continue;
    	num+=i;
    }
    System.out.println(num);
	}
}
