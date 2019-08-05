//Ë®ÏÉ»¨Êý
public class Nnum{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 100;
	int b =999;
	for(int i = 100;i<=b;i++) {
		int x = i/100;
		int y = i/10%10;
		int z = i%10;
		if(i==Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3)) {
			System.out.print(i+"   ");
		}
	}
	}
}
