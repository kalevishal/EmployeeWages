//Emp present or absent
public class EmpAttendanceUC1 {
	public static void main(String args[]){
		int Present=1;
		int attendance=(int)(Math.floor(Math.random()*10)%2);
		if(attendance==Present){
			System.out.println("Emp is Present");
		}
		else{
			System.out.println("Emp is absent");
		}
	}

}
