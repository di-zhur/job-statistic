package fantastic.job.statistic.client.utils;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private DateUtils() {
    }

    public static String convertTimeToDateString(long time) {
        Date date = new Date(time);
        final String pattern = "yyyy-MM-dd'T'HH:mm:ss";
        Format format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static Date convertStringToDate(String date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
