//一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
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
        System.out.println("有"+i+" 种方法");
	}
}