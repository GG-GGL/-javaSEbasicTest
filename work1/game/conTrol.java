package game;

import java.util.Scanner;

public class conTrol {
    public conTrol() {
    	System.out.println("����һ��RPG��Ϸ��");
		System.out.println("1.��ʼ��Ϸ��");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ��");
		System.out.println("������������еĲ�������1-3��");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1) {
			System.out.println("����������Ϸ��ɫ��������");
			String name = in.next();
//			    System.out.println(name == "���");
//			    System.out.println(name);
			    if(name.equals("���")) {
				System.out.println("��������Ϸ��ɫ�����壨1.���� 2.���� 3.���� 4.���� 5.Ԫ�أ�");
				int b = in.nextInt();
				new libai(b);
				System.out.println("�����ɹ�������");
		}
		}
		else if(a==2) {
			System.out.print(""
					+ "��Ϸ�������ɱ���ϣ����Ӱ���Ļ���չ���޹�˾��Ʒ����ϣϣִ�������󶫡�����躡�����������������\n"
					+ "��"
					+ "������ر���ݵĶ�����Ӱ��\n"
					+ "��Ƭ�������ھ��й������⻼�ı����£�\n"
					+ "������������߸���Ϸ�����������������Ĺ��¡�\n"
					+ "��Ƭ��2017��2��10�����й���½��ӳ\n");
		}
		else if(a==3) {
			System.out.println("ϵͳ�˳�����Ϸ����������");
		}	
    }

}
