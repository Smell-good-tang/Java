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