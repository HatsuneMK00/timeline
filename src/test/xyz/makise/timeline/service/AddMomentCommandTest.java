package xyz.makise.timeline.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.makise.timeline.dao.MomentDao;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
class AddMomentCommandTest {
    @Autowired
    AddMomentCommand addMomentCommand;
    private PageView pageView;
    @BeforeEach
    void setUp(){
        pageView = new PageView();
    }

    @Test
    void addMomentStandard(){
        addMomentCommand.execute(pageView);
    }

    @Test
    void formatDateAndStamp(){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}