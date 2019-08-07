package marry;

public class iscanMarry {
    public iscanMarry(Person p1,Person p2){
    	if(!((p1.sex).equals(p2.sex))) {
    		if(((p1.sex).equals("男")&&p1.age>22)&&(p2.sex.equals("女")&&p2.age>20)||(p1.sex.equals("女")&&p1.age>20)&&(p2.sex.equals("男")&&p2.age>22)) {
    			if((p1.isMarry.equals(p2.isMarry))&&(p1.isMarry.equals("否"))) {
    				System.out.println("你俩可以结婚！！！");
    			}
    			else {
    				System.out.println("你俩不能结婚");
    			}
    		}
    	}
    }
}
