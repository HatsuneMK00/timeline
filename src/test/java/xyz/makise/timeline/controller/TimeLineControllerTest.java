package xyz.makise.timeline.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.service.Invoker;
import xyz.makise.timeline.service.MoreMomentCommand;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TimeLineControllerTest {
    private Invoker invoker;
    @Autowired
    PageView pageView;

    @BeforeEach
    void setUp() {
        invoker = new Invoker();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void moreMoments() {
        invoker.setCommand(new MoreMomentCommand());
        invoker.action(pageView);
        System.out.println(pageView);
    }
}