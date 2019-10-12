package xyz.makise.timeline.service;

import xyz.makise.timeline.entity.Moment;
import xyz.makise.timeline.utils.RandomUtils;

import java.util.Date;
import java.util.Random;

public class AddMomentCommand extends Command {
    @Override
    void execute(Object... objects) {
        Moment moment = new Moment();
        Random random = new Random();
        moment.setAuthor(RandomUtils.getRandomString(8));
        moment.setContent(RandomUtils.getRandomString(random.nextInt(300)));
        moment.setTimeStamp();
        momentDao.addMoment(moment);
    }
}
