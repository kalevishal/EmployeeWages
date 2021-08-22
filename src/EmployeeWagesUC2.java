
public class EmployeeWagesUC2 {
	public static void main(String args[]){
		int Is_Full_Time=1;
		int Is_Part_Time=2;
		double randomCheck=Math.floor(Math.random()*10)%3;
		int empWagePerHr=20;
		int empFullDayHr=8;
		int empPartTimeHr=5;
		
		if(Is_Full_Time==randomCheck){
			int salary=(empWagePerHr*empFullDayHr);
			System.out.println(salary);
		}
		else if(Is_Part_Time==randomCheck){
			int salary=(empWagePerHr*empPartTimeHr);
			System.out.println(salary);
		}
		else{
			int salary=0;
		System.out.println(salary);
		}
	}
	

}
