package bankAccountPackage;
import java.time.LocalDate;
import java.time.Month;

public class Date {
	LocalDate currentDate = LocalDate.now();
	int day = currentDate.getDayOfMonth();
	String month = currentDate.getMonth().name();
	int year = currentDate.getYear();
}
