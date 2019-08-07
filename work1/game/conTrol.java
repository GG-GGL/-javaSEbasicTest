package game;

import java.util.Scanner;

public class conTrol {
    public conTrol() {
    	System.out.println("这是一个RPG游戏：");
		System.out.println("1.开始游戏：");
		System.out.println("2.游戏规则：");
		System.out.println("3.结束游戏：");
		System.out.println("请输入您想进行的操作：（1-3）");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1) {
			System.out.println("请输入您游戏角色的姓名：");
			String name = in.next();
//			    System.out.println(name == "李白");
//			    System.out.println(name);
			    if(name.equals("李白")) {
				System.out.println("请输入游戏角色的种族（1.人类 2.精灵 3.兽人 4.矮人 5.元素）");
				int b = in.nextInt();
				new libai(b);
				System.out.println("创建成功！！！");
		}
		}
		else if(a==2) {
			System.out.print(""
					+ "游戏规则》是由北京希世纪影视文化发展有限公司出品，高希希执导，何润东、黄子韬、古力娜扎领衔主演\n"
					+ "，"
					+ "秋瓷炫特别出演的动作电影。\n"
					+ "该片讲述了在旧中国内忧外患的背景下，\n"
					+ "各方势力都想颠覆游戏规则挣脱宿命牢笼的故事。\n"
					+ "该片于2017年2月10日在中国大陆上映\n");
		}
		else if(a==3) {
			System.out.println("系统退出，游戏结束！！！");
		}	
    }

}
