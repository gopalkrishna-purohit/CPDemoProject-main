package com.demo.utils;

import com.demo.constants.FrameworkConstants;
import com.demo.enums.PropertiesUtils;

import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Properties;

public final class PropertyFile {

    private PropertyFile() {

    }

    private static Properties prop = new Properties();


    public static String getValue(PropertiesUtils key) {

        try {

            FileInputStream file = new FileInputStream(FrameworkConstants.getPropFilePath());
            prop.load(file);



        } catch (Exception E) {

            System.out.println("Something is wrong with property parameters");
        }
        return prop.getProperty(key.name().toLowerCase());
    }

}
