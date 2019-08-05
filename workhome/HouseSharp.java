//ÎÝ×ÓÄ£ÐÍ
public class HouseSharp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a = 5;
	    int b = 5;
	    int c = 0;
	    int d = 5;
	    int z = 0;
	    char sign = '*';
	    char empty = ' ';
	    for(int i = 0;i < b;i++){
	    	for(int j = a;j > 1;j--){
		    	System.out.print(" ");	
		    }
	    	System.out.print("*****");
	    	for(int x = 0;x < b;x++) {
	    		for(int y = 0;y < c;y++){
	    			System.out.print(" ");
	    			}
	    		c+=2;
	    		System.out.print("*");
	    		break;
	    		
	    	}
	    	System.out.println("");
	    	a--;
	    }
	    for(z = 0;z < d;z++) {
		    if(z==0||z==4) {
		    	for(int line = 0;line<14; line++) {
		    		System.out.print("*");
		    	}
		    	System.out.println("");
		    }
		    else {
		    	for(int line2 = 0;line2<14; line2++) {
		    		if(line2==0||line2==13) {
		    			System.out.print("*");
		    		}
		    		else {
		    			System.out.print(" ");
		    		}
		    	}
		    	System.out.println("");
		    }
		    
	    }
	}

}
