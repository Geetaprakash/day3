public class EmpWageUC2 {
 	public static void main(String[] args) {
	int is_ful_time = 1;
	int em_r_perhr = 20;
	int emphrs = 0;
	int empwage = 0;
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if (empcheck == is_ful_time)
	emphrs = 8;
    else
	emphrs = 0;
empwage = emphrs * em_r_perhr;
System.out.println("empwage: " + empwage);
}
}
OUTPUT
Prakash@Geeta MINGW64 ~/javahelloworld (master)
$ less EmpWageUC2.java

Prakash@Geeta MINGW64 ~/javahelloworld (master)
$ javac EmpWageUC2.java

