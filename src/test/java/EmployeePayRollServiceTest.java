
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeePayRollServiceTest
{
    static EmployeePayrollService employeePayrollService;

    @BeforeClass
    public static void initializeConstructor() {
        employeePayrollService = new EmployeePayrollService();
    }

    @Test
    public void printWelcomeMessage() {
        employeePayrollService.printWelcomeMessage();
    }
}