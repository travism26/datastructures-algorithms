package datastructure.algorithms.OOD.hospitalExample.clients;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;
import datastructure.algorithms.OOD.hospitalExample.domain.Nurse;
import datastructure.algorithms.OOD.hospitalExample.domain.dao.EmployeeDAO;
import datastructure.algorithms.OOD.hospitalExample.reporting.EmployeeReportFormatter;
import datastructure.algorithms.OOD.hospitalExample.reporting.Formatter;
import datastructure.algorithms.OOD.hospitalExample.reporting.formatters.formatCsv;
import datastructure.algorithms.OOD.hospitalExample.reporting.formatters.formatXml;

import java.sql.SQLException;

/*
 * This class still has to much responsibility can seperate out all the methods into their own
 */
public class ClientModule {

    public void hireNewEmployee(Employee employee) {
        // Tightly coupled classes to employee
        EmployeeDAO employeeDao = new EmployeeDAO();
        try {
            employeeDao.saveEmployee(employee);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void terminateEmployee(Employee employee) {
        // Tight coupled classes
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public void printEmployeeReport(Employee employee, Formatter formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

    public static void main(String[] args) {
        ClientModule obj = new ClientModule();
        Employee peggy = new Nurse(1, "peggy", "Nurse", true);
        // two different type of formats at runtime.
        Formatter xmlFormat = new formatXml();
        Formatter csvFormat = new formatCsv();

        obj.hireNewEmployee(peggy);
        obj.printEmployeeReport(peggy, xmlFormat);
        obj.printEmployeeReport(peggy, csvFormat);

        peggy.performDuties();

    }


}
