package 矩阵运算;

import java.util.Scanner;

class t {
	int i, j, i1, j1, i2, j2, i3;

	void add(float a[][], float b[][], float c[][]) {
		// if(a.length==b.length&&a[i].length==b[i].length){
		// 第一层for取行，第二层for取列
		for (i = 0; i < a.length; i++)
			for (j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
				// 矩阵的一行算完了，输出换行符
				if (j == a[i].length - 1) {
					System.out.println();
				}
			}
	}

	// }
	void jian(float a[][], float b[][], float c[][]) {
		// if(a.length==b.length&&a[i1].length==b[i1].length){
		// 第一层for取行，第二层for取列
		for (i1 = 0; i1 < a.length; i1++)
			for (j1 = 0; j1 < a[i1].length; j1++) {
				c[i1][j1] = a[i1][j1] - b[i1][j1];
				System.out.print(c[i1][j1] + "\t");
				// 矩阵的一行算完了，输出换行符
				if (j1 == a[i1].length - 1) {
					System.out.println();
				}
			}
	}

	// }
	void cheng(float a[][], float b[][], float c[][]) {
		// 第一层for取行，第二层取列，第三行计算第i2行、j2列的值
		for (i2 = 0; i2 < a.length; i2++) {
			for (j2 = 0; j2 < b[0].length; j2++) {
				c[i2][j2] = 0;
				for (int i3 = 0; i3 < b.length; i3++)
					c[i2][j2] += a[i2][i3] * b[i3][j2];
				System.out.print(c[i2][j2] + "\t");
			}
			// 矩阵的一行算完了，输出换行符
			if (j2 == b[0].length)
				System.out.println();
		}
	}
}

public class example {
	public static void main(String[] args) {
		t n = new t();
		int e, f, y, u;
		Scanner reader = new Scanner(System.in);
		System.out.println("请依次输入第一个矩阵的行和列和第二个矩阵的行和列！");
		e = reader.nextInt();
		f = reader.nextInt();
		y = reader.nextInt();
		u = reader.nextInt();
		if (e != y || f != u) {
			System.out.println("由于两者行列数对应不同，所以不能执行矩阵相加减！");
			System.out.println("接下来判断能否相乘：");
		}
		if (f == y)
			System.out.println("可以相乘！");
		else {
			System.out.println("由于既不能相加减也不能相乘，程序终止！");
			return;
		}
		System.out.println("请按顺序输入第一个矩阵与第二个矩阵的元素的值（由左至右，由上至下）");
		float a[][] = new float[e][f];
		float b[][] = new float[y][u];
		for (e = 0; e < a.length; e++)
			for (f = 0; f < a[e].length; f++)// 左矩阵赋值
				a[e][f] = reader.nextFloat();
		for (y = 0; y < b.length; y++)// 右矩阵赋值
			for (u = 0; u < b[y].length; u++)
				b[y][u] = reader.nextFloat();
		System.out.print(b[0].length);
		// 判断所输入矩阵能进行怎样的计算
		if (e == y && f == u) {
			float c[][] = new float[e][f];
			System.out.println("两个矩阵行和列相同，可以相加或相减！");
			System.out.println("两个矩阵相加后的矩阵如下：");
			n.add(a, b, c);// 矩阵相加
			System.out.println("两个矩阵相减后的矩阵如下：");
			n.jian(a, b, c);// 矩阵相减
		}
		if (f == y) {
			float c[][] = new float[e][u];// 结果矩阵
			System.out.println("两个矩阵相乘后的矩阵如下：");
			n.cheng(a, b, c);// 矩阵相乘
		}
	}
}
