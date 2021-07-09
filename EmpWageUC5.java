public class EmpWageUC5 {
	public static final int is_part_time = 1;
	public static final int is_ful_time = 2;
	public static final int em_r_perhr = 20;
	public static final int num_of_workingdays = 2;
	public static void main(String[] args) {
	int emphrs = 0;
	int empwage = 0;
	int totalempwag = 0;
	for (int day = 0; day < num_of_workingdays; day++) {
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
empwage = emphrs * em_r_perhr;
totalempwag += empwage;
System.out.println("empwage: " + empwage);
}
System.out.println("total emp empwage: " + totalempwag);
}
}

