import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Student[] s =  new Student[2];
		StudentService.AcceptData(s);
		StudentService.CalculatePercentage(s);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Id wanted to search:");
			int id = sc.nextInt();
			
			Student s1=StudentService.SearchStudent(s,id);
			if(s1!=null)
			{
				System.out.println(s1);
			}
			else
			{
				System.out.println("Not Found");
			}
		}

	}

}
