/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.util;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 *
 * @author fission
 */
public class DateTimeUtil {
    
    public static String LOCAL_DATE_TIME = "local";

    public static String ZONED_DATE_TIME = "zoned";
    
    public static final String DEFAULT_DATE_TIME = LOCAL_DATE_TIME;
    
        public static final String DATE_TIME_IN_MILLS_FORMAT_FLAT = "yyyyMMddHHmmssSSS";
        public static final String DATE_TIME_IN_MILLS_FORMAT = "yyyy/MM/dd HH:mm:ss.SSS";
        public static final String DATE_TIME_FORMAT_FLAT = "yyyyMMddHHmmss";
        public static final String DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
        public static final String DATE_FORMAT_FLAT = "yyyyMMdd";
        public static final String DATE_FORMAT = "yyyy/MM/dd";
        public static final String TIME_IN_MILLS_FORMAT_FLAT = "HHmmssSSS";
        public static final String TIME_IN_MILLS_FORMAT = "HH:mm:ss.SSS";
        public static final String TIME_FORMAT_FLAT = "HHmmss";
        public static final String TIME_FORMAT = "HH:mm:ss";
       
        public static String getDateString(boolean isFlat) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(isFlat?DATE_FORMAT_FLAT:DATE_FORMAT);
            return formatter.format(getDateTime());
        }
        
        public static String getDateTimeString(boolean isFlat) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(isFlat?DATE_TIME_FORMAT_FLAT:DATE_TIME_FORMAT);
            return formatter.format(getDateTime());
        }
        
        public static String getDateTimeInMillsString(boolean isFlat) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(isFlat?DATE_TIME_IN_MILLS_FORMAT_FLAT:DATE_TIME_IN_MILLS_FORMAT);
            return formatter.format(getDateTime());
        }
        
        private static TemporalAccessor getDateTime() {
            TemporalAccessor dateTime = null;
            if (DEFAULT_DATE_TIME.equals(LOCAL_DATE_TIME)) {
                dateTime = LocalDateTime.now();
            } else if (DEFAULT_DATE_TIME.equals(ZONED_DATE_TIME)) {
                dateTime = ZonedDateTime.now();
            }
            return dateTime;
        }
}
