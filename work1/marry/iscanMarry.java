package marry;

public class iscanMarry {
    public iscanMarry(Person p1,Person p2){
    	if(!((p1.sex).equals(p2.sex))) {
    		if(((p1.sex).equals("��")&&p1.age>22)&&(p2.sex.equals("Ů")&&p2.age>20)||(p1.sex.equals("Ů")&&p1.age>20)&&(p2.sex.equals("��")&&p2.age>22)) {
    			if((p1.isMarry.equals(p2.isMarry))&&(p1.isMarry.equals("��"))) {
    				System.out.println("�������Խ�飡����");
    			}
    			else {
    				System.out.println("�������ܽ��");
    			}
    		}
    	}
    }
}
