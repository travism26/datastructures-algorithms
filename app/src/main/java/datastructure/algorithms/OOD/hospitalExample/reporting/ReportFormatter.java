package datastructure.algorithms.OOD.hospitalExample.reporting;

public class ReportFormatter {

    private String formattedOutput;

    public ReportFormatter(Object object, Formatter formatType) {
        formattedOutput = formatType.formatObject(object);
    }

    public String getFormattedValue() {
        return this.formattedOutput;
    }
}
