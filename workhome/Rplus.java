//������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�
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
