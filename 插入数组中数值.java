第一次：
import java.util.Scanner;


public class paixu {
public static void main(String args[]){
	int i,j,n,q,w,e = 0,r,m,y,z,x;
	double k,t;
	System.out.println("请确定数组元素个数！");
	Scanner reader=new Scanner(System.in);
	n=reader.nextInt();
	double a[]=new double[n];
	System.out.println("请从小到大依次输入各元素数值！");
		for(z=0;z<=n-1;z++){
			a[z]=reader.nextDouble();
		}
		System.out.println("请确认该数组序列!");
		for(j=0;j<=n-1;j++){
		System.out.print(a[j]+"\t");
		}
		Scanner input=new Scanner(System.in);
		k=input.nextDouble();
		System.out.println("请输入插入数组中的位置,a[0]之前为0！");
		m=input.nextInt();
		if(k>=a[m-1]&k<=a[m])
			e=0;
		if(k<a[m-1])
			e=1;
		if(k>a[m])
			e=2;
		switch(e){
		case 0:{
			for(q=0;q<=m-1;q++){
				System.out.print(a[q]+"\t");
			}
			System.out.print(k+"\t");
			for(w=m;m<=n-1;m++){
				System.out.print(a[w]+"\t");
			}
			break;
		}
		case 1:{
			double anew[]=new double[n+1];
			a[m]=k;
			for(x=0;x<m;x++)
				anew[x]=a[x];
			for(x=m;x<=anew.length-m;x++){
				anew[x+1]=a[x];
			}
			for(r=m;r>=0;r--){
				if(a[m]<a[r-1]){
					t=a[m];
					a[m]=a[r-1];
					a[r-1]=a[m];
					m--;
				}
				for(y=0;y<=r;y++)
					System.out.print(a[y]);
				System.out.print(k);
				for(z=m+1;z<=n;z++)
					System.out.print(a[z]);
			}
		}
		}
		}
}

第二次：
import java.util.Scanner;


public class paixu {
public static void main(String args[]){
	int i,j,n,q,w,e = 0,r,m,y,z,x,m1;
	double k,t;
	System.out.println("请确定数组元素个数！");
	Scanner reader=new Scanner(System.in);
	n=reader.nextInt();
	double a[]=new double[n];
	System.out.println("请从小到大依次输入各元素数值！");
		for(z=0;z<=n-1;z++){
			a[z]=reader.nextDouble();
		}
		System.out.println("请确认该数组序列!");
		for(j=0;j<=n-1;j++){
		System.out.print(a[j]+"\t");
		}
		Scanner input=new Scanner(System.in);
		k=input.nextDouble();
		System.out.println("请输入插入数组中的位置,a[0]之前为0！");
		m=input.nextInt();
		m1=m;
		if(k>=a[m-1]&k<=a[m])
			e=0;
		if(k<a[m-1])
			e=1;
		if(k>a[m])
			e=2;
		switch(e){
		case 0:{
			for(q=0;q<=m-1;q++){
				System.out.print(a[q]+"\t");
			}
			System.out.print(k+"\t");
			for(w=m;m<=n-1;m++){
				System.out.print(a[w]+"\t");
			}
			break;
		}
		case 1:{
			double anew[]=new double[n+1];
			for(x=0;x<m;x++)
				anew[x]=a[x];
			for(x=m;x<=anew.length-2;x++){
				anew[x+1]=a[x];
			}
			anew[m]=k;
			for(r=m;r>=1;r--){
				if(anew[m]<anew[r-1]){
					t=anew[m];
					anew[m]=anew[r-1];
					anew[r-1]=t;
					m--;
				}
			}
				for(y=0;y<=m1-2;y++)
					System.out.print(anew[y]+"\t");
				System.out.print(k+"\t");
				for(z=m1;z<=anew.length-1;z++)
					System.out.print(anew[z]+"\t");
			}
			break;
		}
	
		}
		}

第三次：
import java.util.Scanner;


public class paixu {
public static void main(String args[]){
	int i,j,n,q,w,e = 0,r,m,y,z,x,m1;
	double k,t;
	System.out.println("请确定数组元素个数！");
	Scanner reader=new Scanner(System.in);
	n=reader.nextInt();
	double a[]=new double[n];
	System.out.println("请从小到大依次输入各元素数值！");
		for(z=0;z<=n-1;z++){
			a[z]=reader.nextDouble();
		}
		System.out.println("请确认该数组序列!");
		for(j=0;j<=n-1;j++){
		System.out.print(a[j]+"\t");
		}
		Scanner input=new Scanner(System.in);
		k=input.nextDouble();
		System.out.println("请输入插入数组中的位置,a[0]之前为0！");
		m=input.nextInt();
		m1=m;
		if(k>=a[m-1]&k<=a[m])
			e=0;
		if(k<a[m-1])
			e=1;
		if(k>a[m])
			e=2;
		switch(e){
		case 0:{
			for(q=0;q<=m-1;q++){
				System.out.print(a[q]+"\t");
			}
			System.out.print(k+"\t");
			for(w=m;m<=n-1;m++){
				System.out.print(a[w]+"\t");
			}
			break;
		}
		case 1:{
			double anew[]=new double[n+1];
			for(x=0;x<m;x++)
				anew[x]=a[x];
			for(x=m;x<=anew.length-2;x++){
				anew[x+1]=a[x];
			}
			anew[m]=k;
			for(r=m;r>=1;r--){
				if(anew[m]<anew[r-1]){
					t=anew[m];
					anew[m]=anew[r-1];
					anew[r-1]=t;
					m--;
				}
			}
				for(y=0;y<=anew.length-1;y++)
					System.out.print(anew[y]+"\t");
			}
			break;
		}
	
		}
		}

第四次：
import java.util.Scanner;


public class paixu {
public static void main(String args[]){
	int i,j,n,q,w,e = 0,r,m,y,z,x,m1;
	double k,t;
	System.out.println("请确定数组元素个数！");
	Scanner reader=new Scanner(System.in);
	n=reader.nextInt();
	double a[]=new double[n];
	System.out.println("请从小到大依次输入各元素数值！");
		for(z=0;z<=n-1;z++){
			a[z]=reader.nextDouble();
		}
		System.out.println("请确认该数组序列!");
		for(j=0;j<=n-1;j++){
		System.out.print(a[j]+"\t");
		}
		Scanner input=new Scanner(System.in);
		k=input.nextDouble();
		System.out.println("请输入插入数组中的位置,a[0]之前为0！");
		m=input.nextInt();
		m1=m;
		if(m!=0&&k>=a[m-1]&&k<=a[m])
			e=0;
		if(m!=0&&k<a[m-1])
			e=1;
		if(k>a[m])
			e=2;
		switch(e){
		case 0:{
			for(q=0;q<=m-1;q++){
				System.out.print(a[q]+"\t");
			}
			System.out.print(k+"\t");
			for(w=m;m<=n-1;m++){
				System.out.print(a[w]+"\t");
			}
			break;
		}
		case 1:{
			double anew[]=new double[n+1];
			for(x=0;x<m;x++)
				anew[x]=a[x];
			for(x=m;x<=anew.length-2;x++){
				anew[x+1]=a[x];
			}
			anew[m]=k;
			for(r=m;r>=1;r--){
				if(anew[m]<anew[r-1]){
					t=anew[m];
					anew[m]=anew[r-1];
					anew[r-1]=t;
					m--;
				}
			}
				for(y=0;y<=anew.length-1;y++)
					System.out.print(anew[y]+"\t");
			}
			break;
		case 2:{
			double anewnew[]=new double[n+1];
			for(x=0;x<m;x++)
				anewnew[x]=a[x];
			for(x=m;x<=anewnew.length-2;x++){
				anewnew[x+1]=a[x];
			}
			anewnew[m]=k;
			for(r=m;r<=anewnew.length-2;r++){
				if(anewnew[m]>anewnew[r+1]){
					t=anewnew[m];
					anewnew[m]=anewnew[r+1];
					anewnew[r+1]=t;
					m++;
				}
			}
				for(y=0;y<=anewnew.length-1;y++)
					System.out.print(anewnew[y]+"\t");
			}
break;
		}
		}
		}


第五次：无bug
import java.util.Scanner;


public class paixu {
public static void main(String args[]){
	int i,j,n,q,w,e = 0,r,m,y,z,x,m1,b;
	double k,t;
	System.out.println("请确定数组元素个数！");
	Scanner reader=new Scanner(System.in);
	n=reader.nextInt();
	double a[]=new double[n];
	System.out.println("请从小到大依次输入各元素数值！");
		for(z=0;z<=n-1;z++){
			a[z]=reader.nextDouble();
		}
		System.out.println("请确认该数组序列!");
		for(j=0;j<=n-1;j++){
		System.out.print(a[j]+"\t");
		if(j==n-1)
			System.out.println();
		}
		System.out.println("如果确认无误请输入1，有误的话请输入0!");
		b=reader.nextInt();
		if(b==0){
		System.out.println("程序中断，请重新运行！");
		return;
		}
		if(b==1){
			System.out.println("请继续运行！");
		System.out.println("请输入要插入数据的值！");
		Scanner input=new Scanner(System.in);
		k=input.nextDouble();
		System.out.println("请输入插入数组中的位置,a[0]之前为0！");
		m=input.nextInt();
		m1=m;
		if(m!=0&&k>=a[m-1]&&k<=a[m])
			e=0;
		if(m!=0&&k<a[m-1])
			e=1;
		if(k>a[m])
			e=2;
		switch(e){
		case 0:{
			for(q=0;q<=m-1;q++){
				System.out.print(a[q]+"\t");
			}
			System.out.print(k+"\t");
			for(w=m;w<=n-1;w++){
				System.out.print(a[w]+"\t");
			}
			break;
		}
		case 1:{
			double anew[]=new double[n+1];
			for(x=0;x<m;x++)
				anew[x]=a[x];
			for(x=m;x<=anew.length-2;x++){
				anew[x+1]=a[x];
			}
			anew[m]=k;
			for(r=m;r>=1;r--){
				if(anew[m]<anew[r-1]){
					t=anew[m];
					anew[m]=anew[r-1];
					anew[r-1]=t;
					m--;
				}
			}
				for(y=0;y<=anew.length-1;y++)
					System.out.print(anew[y]+"\t");
			}
			break;
		case 2:{
			double anewnew[]=new double[n+1];
			for(x=0;x<m;x++)
				anewnew[x]=a[x];
			for(x=m;x<=anewnew.length-2;x++){
				anewnew[x+1]=a[x];
			}
			anewnew[m]=k;
			for(r=m;r<=anewnew.length-2;r++){
				if(anewnew[m]>anewnew[r+1]){
					t=anewnew[m];
					anewnew[m]=anewnew[r+1];
					anewnew[r+1]=t;
					m++;
				}
			}
				for(y=0;y<=anewnew.length-1;y++)
					System.out.print(anewnew[y]+"\t");
			}
		break;
		}
		}
		}
}
