package game;

import java.util.Random;

public class libai {
	Random a = new Random();
	String name = "李白";
	char sex = '男';
	String kind;
	String occup = "打野";
	int power = a.nextInt(9999);
	int speed = a.nextInt(9999);
	int spirit = a.nextInt(9999);
	int intellect = a.nextInt(9999);
	int body = 150;
	int magic = 230;
	int j=1;
	public libai(int j) {
		if(j==1) {
			kind = "人类";
		}
		else if(j==2) {kind = "精灵";}
		else if(j==3) {kind = "兽人";}
		else if(j==4) {kind = "矮人";}
		else if(j==5) {kind = "元素";}
		System.out.println("名字"+name);
		System.out.println("性别"+sex);
		System.out.println("种族"+kind);
		System.out.println("职业"+occup);
		System.out.println("力量"+power);
		System.out.println("敏捷"+speed);
		System.out.println("体力"+spirit);
		System.out.println("智力"+intellect);
		System.out.println("生命值"+body);
		System.out.println("魔法值"+magic);
		
	}
}
