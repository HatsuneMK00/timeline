package xyz.makise.timeline.service;

import org.springframework.stereotype.Component;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;

import java.util.ArrayList;

@Component("moreMomentCommand")
public class MoreMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        PageView pageView = (PageView) objects[0];
//        用于检验是否超出限度 配合lineLimit
        int lineSum = 0;
//        传进来的第一个参数是已有的PageView对象
        if (!pageView.isPageOverFlow()) {
            for (Moment moment : pageView.getMoments()
            ) {
                lineSum += (moment.getContent().length() / pageView.getWordsPerLine() + 1);
            }
        }
        //        这边采用深拷贝的方式复制moments
        ArrayList<Moment> moments = momentDao.getMoments(pageView.getMomentCount());
        for (Moment moment : moments) {
            moment.setLineCount(moment.getContent().length() / pageView.getWordsPerLine() + 1);
//            这个属性不知道为什么封装不进数据库里
            lineSum += moment.getLineCount();
            pageView.getMoments().add(moment);
        }
        if (lineSum > pageView.getLineLimit()) {
            pageView.setPageOverFlow(true);
        }
        pageView.setMomentCount(pageView.getMoments().size());
    }
}
