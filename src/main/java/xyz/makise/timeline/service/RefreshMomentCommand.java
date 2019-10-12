package xyz.makise.timeline.service;

import org.springframework.stereotype.Component;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.utils.SpringUtil;

import java.util.ArrayList;

@Component("refreshMomentCommand")
public class RefreshMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        PageView pageView = (PageView) objects[0];
        pageView.clear();
//        这里依赖了另一个实现类 感觉可能不太好
        Command addMomentCommand = (Command) SpringUtil.getBean("addMomentCommand");
        addMomentCommand.execute(pageView);
//        这里又要依赖另一个实现类 惊了。。
//        可能这里用转发会比较好
        Command moreMomentCommand = (Command) SpringUtil.getBean("moreMomentCommand");
        moreMomentCommand.execute(pageView);
    }
}
