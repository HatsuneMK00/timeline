package xyz.makise.timeline.service;

import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;

import java.util.ArrayList;

public class MoreMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        PageView pageView = (PageView) objects[0];
        int lineSum = 0;
//        传进来的第一个参数是已有的PageView对象
        if (!pageView.isPageOverFlow()) {
            for (Moment moment : pageView.getMoments()
            ) {
                lineSum += moment.getContent().length();
            }
        }
        ArrayList<Moment> moments = momentDao.getMoments(pageView.getMomentCount());
        for (Moment moment : moments) {
            moment.setLineCount(moment.getContent().length() / pageView.getWordsPerLine() + 1);
            lineSum += moment.getLineCount();
            pageView.getMoments().add(moment);
        }
        if (lineSum > pageView.getLineLimit()){
            pageView.setPageOverFlow(true);
        }
    }
}
