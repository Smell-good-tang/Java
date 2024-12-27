package Example2;

import java.util.Scanner;

public class 例题 {
public static void main(String args[])
{
	Scanner reader=new Scanner(System.in);
	double a,b,c;
	double area,perim,s;
	System.out.print("输入三边的长度：");
	a=reader.nextDouble();//读入三边长度
	b=reader.nextDouble();
	c=reader.nextDouble();
	if(a+b>c&&a+c>b&&b+c>a)//任意两边之和大于第三边
	{
		perim=a+b+c;
		s=perim/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("三角形的三边长是："+a+","+b+","+c);
		System.out.printf("三角形的面积：%.2f,",area);
		System.out.printf("三角形的周长：%.2f\n",perim);
	}
	else
		System.out.println("所给的三边不能构成三角形！");
	}
}
----------------------------------------------------------------------------
package Example2;

import java.util.Scanner;

public class 例题 {
public static void main(String args[])
{
	int score,grade;
	Scanner reader=new Scanner(System.in);
	System.out.print("输入成绩：");
	score=reader.nextInt();
	grade=score/10;
	switch(grade)
	{
	case 10:
	case 9:
		System.out.println("优秀");break;
	case 8:
		System.out.println("良好");break;
	case 7:
		System.out.println("中等");break;
	case 6:
		System.out.println("及格");break;
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
	case 0:
		System.out.println("不及格");break;
		default:
			System.out.println("成绩输入错误！");
	}
	}
}
---------------------------------------------------
//斐波那契数列
package Example2;

import java.util.Scanner;

public class 例题 {
public static void main(String args[])
{
long f1=1,f2=1;
int counter=0;
String format="%10d";
do
{
	System.out.printf(format+format, f1,f2);
	counter+=2;
	if(counter%6==0)
		System.out.println();
	f1=f1+f2;
	f2=f2+f1;
}while(counter<36);
}
}
//优化求值斐波那契数列
package example1;

import java.util.Scanner;

public class example1 {
public static void main(String args[])
{
long f1=1,f2=1,amount;
System.out.println("请问要求第几项斐波那契数列项值：");
Scanner reader=new Scanner(System.in);
amount=reader.nextInt();
int counter=0;
String format="%d";
String format_1="%s";
do
{
	//-1--System.out.printf(format+format_1+format+format_1, f1,'\n',f2,'\n');
	//-2--System.out.printf(format+format, f1,f2);
	counter+=2;
	/*-2-if(counter%6==0)
		System.out.println();*/
	f1=f1+f2;
	f2=f2+f1;
}while(counter<amount-2);
if(amount==1) {
	System.out.printf(format_1+format+format_1+format,"斐波那契数列第",amount,"项是：", 1);
	return;
}
else if(amount==2) {
	System.out.printf(format_1+format+format_1+format,"斐波那契数列第",amount,"项是：", 1);
	return;
}
else {
	if(amount%2!=0) {
	System.out.printf(format_1+format+format_1+format,"斐波那契数列第",amount,"项是：", f1);
	return;
	}
	else{
	System.out.printf(format_1+format+format_1+format,"斐波那契数列第",amount,"项是：", f2);
	return;
	}	
}
}
}
-------------------------------------------------------------------------------------------
package Example2;

import java.util.Scanner;

public class afs 
{
	public static void main(String args[])
{
	int M1,N;
	Scanner reader=new Scanner(System.in);
	M1=reader.nextInt();
	N=reader.nextInt();
	int monkeynum[]=new int[M1];
	for(int i=0;i<monkeynum.length;i++)
	{
		monkeynum[i]=i+1;
}
int count=1;
int king=0;
int index=0;
while(M1!=0)
{
	if(index==monkeynum.length)
	{
		index=0;
	}
	if(count==N&&monkeynum[index]!=0)
	{
		monkeynum[index]=0;
		M1--;
		count=1;
	}
	if(monkeynum[index]!=0)
	{
		count++;
	}
	index++;
	for(int i=0;i<monkeynum.length;i++)
	{
		System.out.print(monkeynum[i]+"");
	}
	System.out.println("");
}
king=index;
System.out.println("猴子大王的编号是"+king);
}
}
//优化算法描述过程
package example2;

import java.util.Scanner;

public class example2
{
	public static void main(String args[])
{
	int M1,N;
	System.out.println("猴子的数量是：");
	Scanner reader=new Scanner(System.in);
	M1=reader.nextInt();
	System.out.println("猴子先排成一圈。要求先从前往后数，从被踢掉的那只再往后数，循环下去，直到还剩最后一只。");
	System.out.println("请问要踢掉第几只猴子：");
	N=reader.nextInt();
	int monkeynum[]=new int[M1];
	for(int i=0;i<monkeynum.length;i++)
	{
		monkeynum[i]=i+1;
}
int count=1;
int king=0;
int index=0;
int times=0;
String format1="%s",format2="%d";
System.out.println("计算步骤：");
while(M1!=0)
{
	if(index==monkeynum.length)
	{
		index=0;
	}
	if(count==N&&monkeynum[index]!=0)
	{
		monkeynum[index]=0;
		M1--;
		count=1;
		if(M1!=0)
			System.out.printf(format1+format2+format1,"踢掉第",index+1,"只：");
	}
	if(monkeynum[index]!=0)
	{
		count++;
	}
	index++;
	times++;
	if(times==1)
		System.out.println("原猴子群编号是：");
	for(int i=0;i<monkeynum.length;i++)
	{
		System.out.print(monkeynum[i]+"");
	}
	System.out.println("");
}
king=index;
System.out.println("猴子大王的编号是："+king);
}
}