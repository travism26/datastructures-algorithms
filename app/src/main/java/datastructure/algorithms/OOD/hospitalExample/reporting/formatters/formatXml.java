package datastructure.algorithms.OOD.hospitalExample.reporting.formatters;

import datastructure.algorithms.OOD.hospitalExample.reporting.Formatter;

public class formatXml implements Formatter {

    @Override
    public String formatObject(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }
}
