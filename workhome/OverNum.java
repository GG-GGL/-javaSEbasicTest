//1000以内的完数
public class OverNum{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 1000;
    for(int i = 1;i<=a;i++) {
    	int s = 0;
    	for(int j = 1;j<=i/2;j++) {
    		if(i%j==0) {
    			s+=j;
    		}
    		}
    		if(s==i) {
    			System.out.print(i+"  ");
    		}
    }
	}
}
