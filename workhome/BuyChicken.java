//һ��ԪǮ��ټ�,����ÿֻ��Ԫ��ĸ��ÿֻ��Ԫ�� С����С��Ǯ�ͣ���ֻС����һԪ,����ĸ����С������������м��ֹ��򷽷�?
public class BuyChicken{
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
        int cockPrice = 5;
        int henPrice = 3;
        int litchickennum;
        int cockNum;
        int henNum;
        int surPlus;
        int i = 0; 
        for(cockNum=0;cockNum<20;cockNum++) {
        	for(henNum=0;henNum<33;henNum++) {
        		surPlus = 100-cockNum*cockPrice-henNum*henPrice;
        		if(surPlus>0) 
        		{
        			litchickennum = surPlus*3;
        			System.out.println(cockNum+"  "+henNum+"  "+litchickennum+"  ");
        			i++;
        		}
        	}
        }
        System.out.println("��"+i+" �ַ���");
	}
}