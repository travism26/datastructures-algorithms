package datastructure.algorithms.OOD.hospitalExample.domain.dao;

import datastructure.algorithms.OOD.hospitalExample.database.DatabaseConnectionManager;
import datastructure.algorithms.OOD.hospitalExample.domain.Employee;

import java.sql.SQLException;

public class EmployeeDAO {

    private DatabaseConnectionManager dcm;

    // responsible for saving employee object to database
    public long saveEmployee(Employee employee) throws SQLException {
        System.out.println("Saving Employee to database:"+ employee.toString());
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("INSERT INTO employee_table");
//        connectionManager.disconnect();

        return employee.getId(); // return some id from the database? or return true / false
    }

    // generally not good to "Delete" data instead set the working => false?
    public boolean deleteEmployee(Employee employee) {
        System.out.println("Deleting Employee:'"+employee.toString() + "' From the database");
        return true;
    }
}
