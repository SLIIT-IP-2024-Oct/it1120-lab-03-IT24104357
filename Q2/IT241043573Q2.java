public class IT241043573Q2
{
	public static void main(String[] args)
	{
		int monthly_salary, number_of_OT_hours,OT_hourly_rate,Total_Salary,OT_Amount;
		monthly_salary=50000;	
		number_of_OT_hours=4;
		OT_hourly_rate=1000;
		OT_Amount=number_of_OT_hours*OT_hourly_rate;
		Total_Salary=monthly_salary+OT_Amount;
		System.out.println(Total_Salary);
		
	}
}