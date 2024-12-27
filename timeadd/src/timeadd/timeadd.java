package timeadd;

import java.math.BigDecimal;
import java.util.Scanner;

public class timeadd {
	public static double subtract1(double v1,double v2){
		BigDecimal bd1=new BigDecimal(Double.toString(v1));
		BigDecimal bd2=new BigDecimal(Double.toString(v2));
		return bd1.subtract(bd2).doubleValue();
	}
	public static double subtract2(double v3,double v4){
		BigDecimal bd3=new BigDecimal(Double.toString(v3));
		BigDecimal bd4=new BigDecimal(Double.toString(v4));
		return bd3.subtract(bd4).doubleValue();
	}
	public static double add1(double v5,double v6){
		BigDecimal bd5=new BigDecimal(Double.toString(v5));
		BigDecimal bd6=new BigDecimal(Double.toString(v6));
		return bd5.add(bd6).doubleValue();
	}
	public static double multiply1(double v7,double v8){
		BigDecimal bd7=new BigDecimal(Double.toString(v7));
		BigDecimal bd8=new BigDecimal(Double.toString(v8));
		return bd7.multiply(bd8).doubleValue();
	}
public static void main(String []args){
	int i,j,d,e;
	double c;
	Scanner reader=new Scanner(System.in);
	System.out.println("请输入个数：");
	i=reader.nextInt();
	double n[]=new double[i];
	int a[]=new int[i];
	double b[]=new double[i];
	System.out.println("请输入要计算的数值：");
	for(i=0;i<=n.length-1;i++){
		n[i]=reader.nextDouble();
		a[i]=(int) (n[i]/1);
		b[i]=subtract1(n[i],a[i]);
	}
	d=a[0];
	c=b[0];
	for(j=1;j<=n.length-1;j++){
	   d+=a[j];
	   c=add1(c,b[j]);
	   if(c>=0.6)
	   {
		   d+=(int)(c/0.6);
		   if(multiply1(c,100)%60==0)
			   c=0;
		   else
			   c=subtract2(c,multiply1((int)(c/0.6),0.6));
	   }
	   System.out.println(d);
}
	System.out.println("相加的时间是(m/s)：");
	int cc=(int)(c*100);
	System.out.print("精确到毫秒位前一位是：");
	if(cc/10==0)
		System.out.println(d+":"+"0"+cc);
	else
		System.out.println(d+":"+cc);
}
}
