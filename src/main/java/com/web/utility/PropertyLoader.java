package com.web.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyLoader.class);

    private PropertyLoader() {
    }

    public static String getPath(String path) {
        String userDir = System.getProperty("user.dir");
        return userDir + path;
    }

    public static Properties retrieveProperty() {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(getPath("/src/main/resources/config.properties"));
            properties.load(inputStream);
        } catch (IOException e) {
            LOGGER.error("Cannot Read From Config", e);
        }
        return properties;
    }
}
