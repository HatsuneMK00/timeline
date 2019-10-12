package xyz.makise.timeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.service.AddMomentCommand;
import xyz.makise.timeline.service.Command;
import xyz.makise.timeline.service.Invoker;
import xyz.makise.timeline.service.MoreMomentCommand;
import xyz.makise.timeline.utils.SpringUtil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.SplittableRandom;

@Controller
@ResponseBody
@RequestMapping("/timeline")
public class MomentController {
    @Autowired
    PageView pageView;

    @GetMapping("getmore")
    public PageView getMoreMoment(){
        Invoker invoker = new Invoker();
        Command moreMomentCommand = (Command) SpringUtil.getBean("moreMomentCommand");
        invoker.setCommand(moreMomentCommand);
        invoker.action(pageView);
        return pageView;
    }

//    随机添加动态
    @GetMapping("addmoment")
    public void addMoment(){
        Invoker invoker = new Invoker();
        Command addMomentCommand = (Command) SpringUtil.getBean("addMomentCommand");
        invoker.setCommand(addMomentCommand);
        invoker.action(pageView);
    }

//    获取新动态
    @GetMapping("refresh")
    public PageView refreshMoment(){
        Invoker invoker = new Invoker();
        Command refreshMomentCommand = (Command) SpringUtil.getBean("refreshMomentCommand");
        invoker.setCommand(refreshMomentCommand);
        invoker.action(pageView);
        return pageView;
    }
}
