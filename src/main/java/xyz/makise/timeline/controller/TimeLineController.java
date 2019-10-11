package xyz.makise.timeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.service.Command;
import xyz.makise.timeline.service.Invoker;
import xyz.makise.timeline.service.MoreMomentCommand;
import xyz.makise.timeline.service.RefreshMomentCommand;

@Controller
@ResponseBody
@RequestMapping("/timeline")
public class TimeLineController {
    @Autowired
    PageView pageView;

    @GetMapping("more")
    public PageView moreMoments(){
        Invoker invoker = new Invoker();
        Command moreMomentCommand = new MoreMomentCommand();
        invoker.setCommand(moreMomentCommand);
        invoker.action(pageView);
//        System.out.println(pageView);
        return pageView;
    }

    @GetMapping("refresh")
    public PageView refreshMoment(){
        Invoker invoker = new Invoker();
        Command refreshMomentCommand = new RefreshMomentCommand();
        invoker.setCommand(refreshMomentCommand);
        invoker.action(pageView);
        return pageView;
    }

}
