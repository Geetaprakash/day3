public class EmpwbUC1 {
public static void main (String[] args) {
int is_present_full_time = 1;
double empcheck = Math.floor(Math.random() * 10) % 2;
if (empcheck == is_present_full_time)
System.out.println("employee is present");
else
System.out.println("employee is absent");
}
}
