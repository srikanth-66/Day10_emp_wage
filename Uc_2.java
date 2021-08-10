package Day10_EmpWage_Collections;
import java.util.ArrayList;

//import Day10_EmpWage_Collections.Uc_1;
public class Uc_2 
{
	public void empWage()
	{
		Uc_1.empPorA();
		int wfh=20,fdw=8;
		if(Uc_1.getList().contains(1))
		{
			int empwage=wfh*fdw;
			System.out.println("employee wage for day is:"+empwage);
		}
		else
			System.out.println("no salray if u not attand ");


			}
	public static void main(String[] args)
	{

		Uc_2 uc=new Uc_2();
		uc.empWage();
		

		
	}

}
