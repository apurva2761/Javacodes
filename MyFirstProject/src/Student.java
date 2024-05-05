          
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
 private int Id;
 private String Name;
 private Date Doa;
 private int marks1;
 private int marks2;
 private int marks3;

	 //default constructor
	 public Student()
	 {
	 this(0,null,null,0,0,0);
	 }
 public Student(int Id,String nm,Date doa,int m1,int m2,int m3)
 {
	 this.Id=Id;
	 Name=nm;
	 Doa=doa;
	 marks1=m1;
	 marks2=m2;
	 marks3=m3;
 }
public void setId(int id)
{
	this.Id=id;
}
public void setName(String nm)
{
	Name=nm;
}
public void setDoa(Date d)
{
	Doa=d;
}
public void setmarks1(int m1)
{
	marks1=m1;
}
public void setmarks2(int m2)
{
	marks2=m2;
}
public void setmarks3(int m3)
{
	marks3=m3;
}
public int getId()
{
	return Id;
}
public String getName()
{
	return Name;
}
public Date getDoa()
{
	return Doa;
}
public int getmarks1()
{
	return marks1;
}
public int getmarks2()
{
	return marks2;
}
public int getmarks3()
{
	return marks3;
}
public String Tostring()
{
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	String d1=sdf.format(Doa);
	return "Id;"+Id+"Name:"+Name+"Date of admission:"+d1+"Marks1:"+marks1+"Marks2:"+marks2+"Marks3:"+marks3;
}
}

