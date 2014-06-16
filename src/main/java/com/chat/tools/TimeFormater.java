package com.chat.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormater {

    private static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat();
    private static final String TIME_WITH_SECONDS_PATTERN = "HH:mm:ss dd.MM.yyyy";

    private TimeFormater() {
    }

    public static String formatDateWithSeconds(Date date) {
        DATE_FORMATER.applyPattern(TIME_WITH_SECONDS_PATTERN);
        return DATE_FORMATER.format(date);
    }

    public static Date parseDateWithSeconds(String string) {
        DATE_FORMATER.applyPattern(TIME_WITH_SECONDS_PATTERN);
        try {
            return DATE_FORMATER.parse(string);
        } catch (ParseException e) {
            return null;
        }
    }
}
