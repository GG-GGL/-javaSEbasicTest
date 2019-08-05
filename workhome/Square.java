//打印一个正方形
public class Square{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char sign = '*';
    for(int i=0;i<20;i++) {
    	if(i==0||i==19) 
    	{
    		for(int j=0;j<20;j++) {
    		System.out.print(sign+" ");
    		}
    		System.out.println("  ");
    	}
    	else 
    	{
    		for(int x=0;x<20;x++) {
    			if(x==0||x==19)
    			{
    			System.out.print(sign+" ");	
    			}
    			else
    			{
    			System.out.print("  ");	
    			}
    		}
    		System.out.println("");
    	}
    	
    }
	}

}
