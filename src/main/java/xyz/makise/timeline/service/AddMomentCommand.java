package xyz.makise.timeline.service;

import com.fasterxml.jackson.core.json.PackageVersion;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.utils.RandomUtils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

public class AddMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        PageView pageView = (PageView) objects[0];
        Moment moment = new Moment();
        Random random = new Random();
        moment.setAuthor(RandomUtils.getRandomString(8));
        moment.setContent(RandomUtils.getRandomString(random.nextInt(300)));
        moment.setTimeStamp(Timestamp.valueOf(new Date().toString()));
        moment.setImageUrl(RandomUtils.getRandomString(16) + ".pnc");
        moment.setLineCount(moment.getContent().length() / pageView.getWordsPerLine());
        momentDao.addMoment(moment);
    }
}
