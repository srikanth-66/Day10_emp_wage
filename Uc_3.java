package Day10_EmpWage_Collections;

public class Uc_3
{
	public void empWageParttime()
	{
		Uc_1.getList().add((int) Math.floor(Math.random()*10%3));//Initializing the list with 0 or 1 by using ransom
		int wfh=20,fdw=8,ptt=4;
		if(Uc_1.getList().contains(1))
		{
			int empwage=wfh*fdw;
			System.out.println("employee wage for day as full time is:"+empwage);
		}
		else if(Uc_1.getList().contains(2))
		{
			int empwage=wfh*ptt;
			System.out.println("employee wage for day  as partime is:"+empwage);
		}
		else
			System.out.println("employee is absent");
	}
	public static void main(String[] args)
	{

		Uc_3 uc=new Uc_3();
		uc.empWageParttime();
	}
}

