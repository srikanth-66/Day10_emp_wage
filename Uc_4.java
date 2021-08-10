package Day10_EmpWage_Collections;

import java.util.Scanner;

public class Uc_4
{
	int ch;
	public void SwitchCase(int ch)
	{
		//ArrayList<String> ch = arrayList;
		this.ch=ch;
		System.out.println(ch);
		int wfh=20,fdw=8,ptt=4;

		switch(ch)
		{
		
			case 0: System.out.println("employee is absent ");
					break;
			case 1: int empwage=wfh*fdw;
					System.out.println("employee wage for day as full time is:"+empwage);
					break;
			case 2: int empwage1=wfh*ptt;
					System.out.println("employee wage for day  as partime is:"+empwage1);
					break;
			default : System.out.println("Wrong Logic");
					break;
		}
	}
	public static void main(String[] args) 
	{
		int ch=((int) Math.floor(Math.random()*10%3));//Initializing the list with 0 or 1 by using ransom

		Uc_4 uc=new Uc_4();
		uc.SwitchCase(ch);		
	}
}
