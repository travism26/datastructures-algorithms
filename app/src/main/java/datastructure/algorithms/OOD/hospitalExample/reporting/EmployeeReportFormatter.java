package datastructure.algorithms.OOD.hospitalExample.reporting;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, Formatter formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
