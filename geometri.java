import static java.lang.Math.*;
public class geometri{
	public static double rectArea(double b, double h){
		double res = b * h;
		return res;
	}
	public static double recOmkrets(double b, double h){
		double res = (b+h)*2;
		return res;
	}
	public static double circleArea(double r){
		double res = Math.PI * r * r;
		return res;
	}
	public static double circleOmkrets(double d){
		double res = Math.PI * d;
		return res;
	}
	public static double trekantArea(double b, double h){
		double res = (b*h)/2;
		return res;
	}
	public static double trekantOmkrets(double a, double b, double c){
		double res = a + b + c;
		return res;
	}
}