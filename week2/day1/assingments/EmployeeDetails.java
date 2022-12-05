package week2.day1.assingments;


public class EmployeeDetails
{
	public void printEmployeeName(String empName, int empId) 
	{
		
			System.out.println("empName:"+empName);
			System.out.println("empId:"+empId);
			}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println("empAddress:"+empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{
			
			System.out.println("empSalary:"+empSalary);
		}
		public void printEmployeeMobileNumber(long mobNum)
		{
			System.out.println("mobNum:"+mobNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails c1=new EmployeeDetails();
			c1.printEmployeeName("SELKIA",01);
		    c1.getEmployeeAddress("PUDUKKOTTAI");
			c1.printEmployeeSalary(20000.12);
			c1.printEmployeeMobileNumber(6382810309l);

		
	}


	}
