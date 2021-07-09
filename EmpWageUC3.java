public class EmpWageUC3 {
 	public static void main(String[] args) {
	int is_part_time = 1;
	int is_ful_time = 2;
	int em_r_perhr = 20;
	int emphrs = 0;
	int empwage = 0;
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if (empcheck == is_ful_time)
	emphrs = 4;
    else
	emphrs = 8;
empwage = emphrs * em_r_perhr;
System.out.println("empwage: " + empwage);
}
}
OUTPUT:
Prakash@Geeta MINGW64 ~/javahelloworld (master)
$ java EmpWageUC3
empwage: 160
