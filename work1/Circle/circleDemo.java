package Circle;
/*
  练习 2：实现圆（Circle）类
          圆（Circle）类包含圆心（Point p）和半径（int r）两个属性
          提供合理的构造器
          提供方法：
 计算当前图形的面积
 计算当前图形是否包含(contains(Point))指定的点
 重载方法 contains(int x, int y) 图形是否包含坐标x,y
 * */
import java.util.Scanner;
public class circleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.println("请输入圆的半径：");
    double r = in.nextDouble();
    System.out.println("请输入圆点的x坐标y坐标：");
    int x = in.nextInt();
    int y = in.nextInt();
    Point point = new Point(x,y);
    System.out.println("请输入点的x坐标y坐标：");
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    double distance = point.getDistance(x1, y1);
    System.out.println("到原点的距离为"+distance);
    point.getCirclesize(r);
    point.pointin(distance, r);
	}

}
