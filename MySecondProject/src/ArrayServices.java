import java.util.Scanner;

public class ArrayServices {

	public static void addnewdata(int[][] a2) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter data for matrix 1");
			for(int i=0;i<a2.length;i++)
			{
				for(int j=0;j<a2[i].length;j++)
				{
					System.out.println("Enter the data for row "+i+"column "+j);
					a2[i][j]=sc.nextInt();
				}
			}
		}
		
	}

//----------------------------------------------------------------------	
	public static void displaydata(int[][] a2) {
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.print(a2[i][j]);
				
			}
			System.out.println();
		}
		
	}
//--------------------------------------------------------------------
	public static void transposeArray(int[][] a2) {
		
	int transpose [][]=new int [3][3];
		for(int i=0;i<a2.length;i++) 
		{
			for(int j=0;j<a2[i].length;j++)
			{
				transpose[j][i]=a2[i][j];
			}
	}
	//To display transpose Array
		for(int k =0;k<transpose.length;k++)
		{
			for(int i=0;i<transpose[k].length;i++)
			{
				System.out.println(transpose[k][i]);
			}
		}
}

//----------------------------------------------------------------------
	
	public static void rowWiseSumOfArray(int[][] a2) {
		for(int i=0;i<a2.length;i++) 
		{
			int sum=0;
			for(int j=0;j<a2[i].length;j++)
			{
			sum = sum+a2[i][j];
			
			}
			System.out.println("Row wise sum of array =:" +sum);
		}
		
	}
//----------------------------------------------------------------------

	public static void columnWiseSumOfArray(int[][] a2) {
		
		for(int i=0;i<a2.length;i++) 
		{
			int sum=0;
			for(int j=0;j<a2[i].length;j++)
			{
			sum = sum+a2[j][i];
			System.out.println("Column wise  sum of array =:" +sum);
			}
	}
	}

//----------------------------------------------------------------------	

	public static void matrixMultiplication(int[][] a2) {
		int k[][]= new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("Enter elements for matrix2 ");
		ArrayServices.addnewdata(b);
		for(int i=0;i<a2.length;i++) 
		{
			for(int j=0;j<a2[i].length;j++)
			{
				k[i][j]=a2[i][j]*b[j][i];
			}
			
	}
		//to display Multiplication
		for(int p=0;p<k.length;p++)
		{
			for(int n=0;n<k[p].length;n++)
			{
				System.out.println("Multiplication of matrix:"+k[p][n]);
			}			
		}
}

//----------------------------------------------------------------------

	public static void matrixAddition(int[][] a2) {
		int k[][]= new int[3][3];
		int b[][]=new int[3][3];
		ArrayServices.addnewdata(b);
		for(int i=0;i<a2.length;i++) 
		{
			for(int j=0;j<a2[i].length;j++)
			{
				k[i][j]=a2[i][j]+b[i][j];
			}
			
	}
		//to display Addition
		for(int p=0;p<k.length;p++)
		{
			for(int n=0;n<k[p].length;n++)
			{
				System.out.println("Addition of matrix:"+k[p][n]);
			}			
		}	
		
	}
//----------------------------------------------------------------------

	public static void maximummOfArray(int[][] a2) {
		int maxvalue=a2[0][0];
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				if(a2[i][j] > maxvalue)
				{
					maxvalue=a2[i][j];
				}
			}
	}
		System.out.println("Maximum of Array :" +maxvalue);
}
	
//----------------------------------------------------------------------

	public static void maximummOfArrayRowwise(int[][] a2){
		for(int i=0;i<a2.length;i++)
		{ 
			int maxvalue=a2[i][0];
		
			for(int j=0;j<a2[i].length;j++)
			{
				if(a2[i][j]>maxvalue)
				{
					maxvalue = a2[i][j];
				}
			}
			System.out.println("Maximum of Row "+(i+1)+ " :" +maxvalue);
	}
}
	
//----------------------------------------------------------------------

public static void maximummOfArrayColumnwise(int[][] a2) {
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				int maxvalue = a2[0][j];
			
				if(a2[i][j]>maxvalue)
				{
					maxvalue= a2[i][j];
				}
				System.out.println("Maximum of column "+(j+1)+ " :" +maxvalue);
			}
			
		}
}	
}
