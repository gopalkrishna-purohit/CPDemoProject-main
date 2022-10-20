package com.demo.constants;

import com.demo.enums.PropertiesUtils;
import com.demo.utils.PropertyFile;

public class FrameworkConstants {
    private FrameworkConstants() {
    }

    private static final String PropertyFilePath = "src/test/resources/config/config.properties";
    private static final String EXTENTREPORTPATH = "src/test/resources/config/extent-test-output";
    private static final int EXPLICIT_WAIT = 10;

    public static String getPropFilePath() {
        return PropertyFilePath;
    }

    public static int getExplicitWait() {
        return EXPLICIT_WAIT;
    }

    public static String getExtentReportPath() {

        if (PropertyFile.getValue(PropertiesUtils.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
            return EXTENTREPORTPATH + "/" + System.currentTimeMillis();
        } else {
            return EXTENTREPORTPATH + "/" + "index.html";


        }

    }

}
