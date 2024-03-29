package xyz.makise.timeline.service;

import com.fasterxml.jackson.core.json.PackageVersion;
import org.springframework.stereotype.Component;
import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.entity.PageView;
import xyz.makise.timeline.utils.RandomUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Component("addMomentCommand")
public class AddMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        PageView pageView = (PageView) objects[0];
        Moment moment = new Moment();
        Random random = new Random();
//        大小写严格注意
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        moment.setAuthor(RandomUtils.getRandomString(8));
        moment.setContent(RandomUtils.getRandomString(random.nextInt(300)));
        moment.setTimeStamp(Timestamp.valueOf(simpleDateFormat.format(new Date())));
        moment.setImageUrl(RandomUtils.getRandomString(16) + ".pnc");
        moment.setLineCount(moment.getContent().length() / pageView.getWordsPerLine() + 1);
        momentDao.addMoment(moment);
    }
}
