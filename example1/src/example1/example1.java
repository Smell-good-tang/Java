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
