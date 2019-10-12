package xyz.makise.timeline.service;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.makise.timeline.dao.MomentDao;

public abstract class Command {
    @Autowired
    MomentDao momentDao;
//    这里接受的是依赖对象参数
    abstract void execute(Object...objects);
}
