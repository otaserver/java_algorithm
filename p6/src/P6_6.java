import java.util.Random;


public class P6_6 {

	public static void main(String[] args) {
		int i,j;											//声明变量

		Random r=new java.util.Random(10); 			        //随机种子
		for(j=0;j<10;j++)
		{
			for(i=0;i<10;i++)
			{
				System.out.printf("%11d  ",r.nextInt());						//输出随机数
			}
			System.out.print("\n");
		}
	}

}