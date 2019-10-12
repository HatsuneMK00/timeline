package xyz.makise.timeline.dao;

import xyz.makise.timeline.entity.Moment;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MomentDao {
    final static int momentOnce = 5;
    Random random = new Random();

    //    这边不连接数据库 简单模拟一下数据库的操作
    public ArrayList<Moment> getMoments() {
        return null;
    }

    public void addMoment(){

    }

//    private String getRandomString(int length){
//        StringBuffer stringBuffer = new StringBuffer();
//        final String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        for (int i = 0; i < length; i++) {
//            stringBuffer.append(source.charAt(random.nextInt(source.length())));
//        }
//        return stringBuffer.toString();
//    }
//
//    private Timestamp getRandomTimeStamp(){
//        long offset = Timestamp.valueOf("2012-01-01 00:00:00").getTime();
//        long end = Timestamp.valueOf("2019-10-11 00:00:00").getTime();
//        long diff = end - offset + 1;
//        return new Timestamp(offset + (long)(Math.random() * diff));
//    }
}
