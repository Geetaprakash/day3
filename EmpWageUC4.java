public class EmpWageUC4 {
	public static final int is_part_time = 1;
	public static final int is_ful_time = 2;
	public static final int em_r_perhr = 20;
	public static void main(String[] args) {
	int emphrs = 0;
	int empwage = 0;
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empcheck) {
	case is_part_time:
	emphrs = 4;
	break;
	case is_ful_time:
	emphrs = 8;
	break;
default:
	emphrs = 0;s
}
empwage = emphrs * em_r_perhr;
System.out.println("empwage: " + empwage);
}
}

