package Day10_EmpWage_Collections;

public class Uc_6
{
	public static void main(String[] args) 
	{
		int ftt=8;
		int ptt=8;
		int wfh=20;
		int wfmh=100;
		int empwage=0;
		if(wfh<=20 || wfmh<=100)
		{
			for(int i=0;i<=wfh;i++)
			{
				for(int j=0;j<=wfmh;j++)
				{
					empwage=ftt*wfh*wfmh;

				}
			}
			System.out.println("the employee wage is:"+empwage);

			
		}
		
		
	}

}
