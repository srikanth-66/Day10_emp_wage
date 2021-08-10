package Day10_EmpWage_Collections;
public class Uc_5
{
	String emp_name;
	int emp_id;
	static int emp_wage;
	public Uc_5()
	{
		super();
	}
	private void Display()
	{
		System.out.println("employee name:"+emp_name);
		System.out.println("employee id:"+emp_id);

	}
	public Uc_5(String name,int id)
	{
		this.emp_name=name;
		this.emp_id=id;		
		Display();

	}
	public void empWageForMonth(int wph,int typemp,int dim)
	{
		if(typemp==4)
		{
			System.out.println("employe  type is part time");
			int emp_wage=wph*typemp*dim;
			System.out.println(emp_wage);

		}
		else if(typemp==8)
		{
			System.out.println("employe  type is full time");
			int emp_wage=wph*typemp*dim;
			System.out.println(emp_wage);
		}
		else
			System.out.println("employee not going to office no salary");
		
	}
	public static void main(String[] args)
	{
		Uc_5 uc=new Uc_5("Srikanth",166);
		Uc_5 uc_5 = new Uc_5();
		uc_5.empWageForMonth(8, 8, 20);
		uc_5.empWageForMonth(8, 4, 20);

	}
	

}
