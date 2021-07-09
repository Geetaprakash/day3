public class EmpWageUC6 {
	public static final int is_part_time = 1;
	public static final int is_ful_time = 2;
	public static final int em_r_perhr = 20;
	public static final int num_of_workingdays = 2;
	public static final int max_hrs_inmonth = 10;
	public static void main(String[] args) {
	int emphrs = 0;
	int totalemphr = 0;
	int totalworkingdays = 0;
	while (totalemphr <= max_hrs_inmonth && 
	totalworkingdays < num_of_workingdays) {
	totalworkingdays++;	
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empcheck) {
	case is_part_time:
	emphrs = 4;
	break;
	case is_ful_time:
	emphrs = 8;
	break;
default:
	emphrs = 0;
}
totalemphr += emphrs;
System.out.println("Day#:" + totalworkingdays + "emp hr: " +emphrs);
}
int totalempwag = totalemphr * em_r_perhr;
System.out.println("total emp empwage: " + totalempwag);
}
}

