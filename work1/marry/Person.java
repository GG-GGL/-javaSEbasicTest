package marry;
import java.util.Scanner;
public class Person {
	String name;
	String sex;
	int age;
	String isMarry;
	long num;
	String address;
	int teleNum;
   public Person(){ 
	   Scanner in = new Scanner(System.in);
	   System.out.println("���������Ļ�����Ϣ====");
	   System.out.println("��������");
	   String name = in.next();
	   this.name = name;
	   System.out.println("�����Ա�");
	   String sex = in.next();
	   this.sex = sex;
	   System.out.println("��������");
	   int age = in.nextInt();
	   this.age = age;
	   System.out.println("�����Ƿ���");
	   String isMarry = in.next();
	   this.isMarry = isMarry;
	   System.out.println("�������֤��");
	   long num = in.nextLong();
	   this.num = num;
	   System.out.println("����סַ");
	   String address = in.next();
	   this.address = address;
	   System.out.println("���ĵ绰");
	   int teleNum = in.nextInt();
	   this.teleNum = teleNum;
   }
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", isMarry=" + isMarry + ", num=" + num
			+ ", address=" + address + ", teleNum=" + teleNum + "]";
}
  
   

}
