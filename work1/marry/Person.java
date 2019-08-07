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
	   System.out.println("请输入您的基本信息====");
	   System.out.println("您的姓名");
	   String name = in.next();
	   this.name = name;
	   System.out.println("您的性别");
	   String sex = in.next();
	   this.sex = sex;
	   System.out.println("您的年龄");
	   int age = in.nextInt();
	   this.age = age;
	   System.out.println("您的是否结婚");
	   String isMarry = in.next();
	   this.isMarry = isMarry;
	   System.out.println("您的身份证号");
	   long num = in.nextLong();
	   this.num = num;
	   System.out.println("您的住址");
	   String address = in.next();
	   this.address = address;
	   System.out.println("您的电话");
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
