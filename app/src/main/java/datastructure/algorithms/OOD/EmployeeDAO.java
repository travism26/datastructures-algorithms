package datastructure.algorithms.OOD;

public class EmployeeDAO {

    // responsible for saving employee object to database
    public long saveEmployee(Employee employee) {
        System.out.println("Saving Employee to database:"+ employee.toString());
        return employee.getId(); // return some id from the database? or return true / false
    }

    // generally not good to "Delete" data instead set the working => false?
    public boolean deleteEmployee(Employee employee) {
        System.out.println("Deleting Employee:'"+employee.toString() + "' From the database");
        return true;
    }
}
