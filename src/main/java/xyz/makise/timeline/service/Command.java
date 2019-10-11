package xyz.makise.timeline.service;

import xyz.makise.timeline.dao.MomentDao;

public abstract class Command {
    MomentDao momentDao = new MomentDao();
//    这里接受的是依赖对象参数
    abstract void execute(Object...objects);
}
