import java.util.Scanner;

class point{
	int i,j;
	point(int i,int j){
		this.i=i;
		this.j=j;
	}
	void add(float a[][],float b[][],float c[][]){
		if(a.length==b.length&&a[i].length==b[i].length){
			for(i=0;i<a.length;i++)
				for(j=0;j<a[i].length;j++)
					c[i][j]=a[i][j]+b[i][j];
		}
	}
	void jian(float a[][],float b[][],float c[][]){
		if(a.length==b.length&&a[i].length==b[i].length){
			for(i=0;i<a.length;i++)
				for(j=0;j<a[i].length;j++)
					c[i][j]=a[i][j]-b[i][j];
		}
	}
	void cheng(float a[][],float b[][],float c[][]){
		if(a[i].length==b.length){
			int i1=0,j1=0,d=1;
			for(i=0;i<a.length;i++){
				j++;
				c[i1][j1]+=a[i1][j]*b[i][j1];
				if(i==a.length-1){
					d++;
					j1++;
				}
				if(d%(a.length-1)==0)
				{
					i1++;
					j1=0;
				}
			}
		}
	}
}
public class juzhen {
	public static void main(String []args){
		int e,f;
		float a[][]=new float[e][f];
		float b[][]=new float[e][f];
		Scanner reader=new Scanner(System.in);
		System.out.println("请依次输入第一个矩阵的行和列！")
		e=reader.nextInt();
		f=reader.nextInt();
		
		
	}

}
