import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int[][] arr2=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("you can perform following operations on Array =>");
		System.out.print("1.add data\n2.display data\n3.transpose of matrix\n");
		System.out.print("4.rowwise sum\n5.columnwise sum\n6.matrix multiplication\n");
		System.out.print("7.matrix addition\n8.find maximum of array\n");
		System.out.print("9.find maximum row wise\n10.find max columnwise\n11.exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ArrayServices.addnewdata(arr2);
			break;
		case 2:
			ArrayServices.displaydata(arr2);
			break;
		case 3:
			ArrayServices.transposeArray(arr2);
			break;
		case 4:
			ArrayServices.rowWiseSumOfArray(arr2);
			break;
		case 5:
			ArrayServices.columnWiseSumOfArray(arr2);
			break;
		case 6:
			ArrayServices.matrixMultiplication(arr2);
			
			break;
		case 7:
			ArrayServices.matrixAddition(arr2);
			break;
		case 8:
			ArrayServices.maximummOfArray(arr2);
			
				break;
		case 9:
			ArrayServices.maximummOfArrayRowwise(arr2);
			break;
		case 10:
			ArrayServices.maximummOfArrayColumnwise(arr2);
			break;
		
		case 11:
			System.exit(0);
			sc.close();
			System.out.println("Thank you for visiting....");
		default:
			System.out.println("Wrong choice");
			break;
		}
		
		}while(choice!=11);
	}
}
