package game;

import java.util.Random;

public class libai {
	Random a = new Random();
	String name = "���";
	char sex = '��';
	String kind;
	String occup = "��Ұ";
	int power = a.nextInt(9999);
	int speed = a.nextInt(9999);
	int spirit = a.nextInt(9999);
	int intellect = a.nextInt(9999);
	int body = 150;
	int magic = 230;
	int j=1;
	public libai(int j) {
		if(j==1) {
			kind = "����";
		}
		else if(j==2) {kind = "����";}
		else if(j==3) {kind = "����";}
		else if(j==4) {kind = "����";}
		else if(j==5) {kind = "Ԫ��";}
		System.out.println("����"+name);
		System.out.println("�Ա�"+sex);
		System.out.println("����"+kind);
		System.out.println("ְҵ"+occup);
		System.out.println("����"+power);
		System.out.println("����"+speed);
		System.out.println("����"+spirit);
		System.out.println("����"+intellect);
		System.out.println("����ֵ"+body);
		System.out.println("ħ��ֵ"+magic);
		
	}
}
