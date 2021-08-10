package Day10_EmpWage_Collections;

import java.util.ArrayList;

public class Uc_1 
{
	private static ArrayList <Integer> list=new ArrayList<Integer>();
	public static ArrayList <Integer> getList() 
	{
		return list;
	}

	public static void setList(ArrayList <Integer> list) {
		Uc_1.list = list;
	}

	public static void empPorA()
	{
		//declaring the list 
		getList().add((int) Math.floor(Math.random()*10%2));//Initializing the list with 0 or 1 by using ransom
		System.out.println(getList());
		if(getList().contains(1))
		{
			System.out.println("employee is present");
		}
		else
			System.out.println("employee is absent");
		
	}

public static void main(String[] args) 

{
	//Uc_1 uc=new Uc_1();//no need since method static 
	empPorA();
	
}


}
