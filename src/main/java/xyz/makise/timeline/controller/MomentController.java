package xyz.makise.timeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.service.Command;
import xyz.makise.timeline.service.Invoker;
import xyz.makise.timeline.service.MoreMomentCommand;

import java.util.ArrayList;

@Controller
@ResponseBody
@RequestMapping("/timeline")
public class MomentController {
    @Autowired
    PageView pageView;

    @GetMapping("getmore")
    public PageView getMoreMoment(){
        Invoker invoker = new Invoker();
        Command moreMomentCommand = new MoreMomentCommand();
        invoker.setCommand(moreMomentCommand);
        invoker.action(pageView);
        return pageView;
    }
}
