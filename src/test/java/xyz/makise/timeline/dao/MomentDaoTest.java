package xyz.makise.timeline.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import xyz.makise.timeline.entity.Moment;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MomentDaoTest {
    private MomentDao momentDao = new MomentDao();

    @BeforeEach
    void setUp(){
        momentDao = new MomentDao();
    }

    @Test
    void getTimeStamp(){
//        System.out.println(momentDao.getRandomTimeStamp());
    }

    @Test
    void getMoments(){
        ArrayList<Moment> moments = momentDao.getMoments();
        for (Moment m :moments) {
            System.out.println(m);
        }
    }

}