package Circle;

public class Point {
	int x;
	int y;
    public Point(int x,int y){
    	this.x = x;
    	this.y = y;
    }
    public double getDistance(int a,int b) {
	   return Math.sqrt(Math.pow(a-this.x, 2)+Math.pow(b-this.y,2));
    }
    public void getCirclesize(double r){
    	System.out.println("圆的面积是"+Math.PI*r*r);
    }
    public void pointin(double distance,double r){
    	if(distance > r) {
    		System.out.println("该点不在圆内！！！");
    	}
    	else {
    		System.out.println("该点在圆内！！！");
    	}
    }
}
