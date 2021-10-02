package datastructure.algorithms.OOD.hospitalExample.reporting.formatters;

import datastructure.algorithms.OOD.hospitalExample.reporting.Formatter;

public class formatCsv implements Formatter {
    @Override
    public String formatObject(Object object) {
        return "CSV : , , ," + object.toString();
    }
}
