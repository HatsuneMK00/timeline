package xyz.makise.timeline.utils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

public class RandomUtils {
    public static String getRandomString(int length) {
        Random random = new Random(new Date().getTime());
        StringBuffer stringBuffer = new StringBuffer();
        final String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < length; i++) {
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }

    public static Timestamp getRandomTimeStamp() {
        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
        long end = Timestamp.valueOf("2019-10-11 00:00:00").getTime();
        long diff = end - offset + 1;
        return new Timestamp(offset + (long) (Math.random() * diff));
    }
}
