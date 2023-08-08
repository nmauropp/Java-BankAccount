package bankAccountPackage;
import java.time.LocalDate;
import java.time.Month;

public class Date {
	LocalDate currentDate = LocalDate.now();
	int day = currentDate.getDayOfMonth();
	int month = currentDate.getMonthValue();
	int year = currentDate.getYear();
}
