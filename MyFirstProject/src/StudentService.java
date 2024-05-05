import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {

	public static void AcceptData(Student [] s) {
		
		try (Scanner sc = new Scanner(System.in)) {
			for(int i =0;i<s.length;i++)
			{
				System.out.println("Enter id");
				int id= sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name: ");
				String name=sc.next();
				System.out.println("Enter DOA: ");
				String Doa=sc.next();
				SimpleDateFormat sdf= new SimpleDateFormat("DD/MM/YYYY");
				System.out.println("Enter marks1");
				int m1= sc.nextInt();
				System.out.println("Enter marks2");
				int m2= sc.nextInt();
				System.out.println(" enter marks3");
				int m3= sc.nextInt();
				try {
						Date d= sdf.parse(Doa);
						//object creation
						s[i]=new Student(id,name,d,m1,m2,m3);
						
				}
				catch(ParseException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static void CalculatePercentage(Student[] s) {
		for(int i = 0;i<s.length;i++)
		{
			int perc= (s[i].getmarks1()+s[i].getmarks2()+s[i].getmarks3())/3;
			System.out.println("Percentages of Student"+(i+1)+"is :"+perc);
			
		}
		
	}

	public static Student SearchStudent(Student[] s, int id) {
		for(Student S: s)
		{
			if(S.getId()==id)
			{
				return S;
			}
		}
		return null;
	}

	

}
