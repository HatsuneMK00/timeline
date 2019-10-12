package xyz.makise.timeline.service;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.makise.timeline.dao.MomentDao;

public abstract class Command {
//    所有用到了这个自动装配的dao对象的对象都需要由spring容器管理
    @Autowired
    MomentDao momentDao;
//    这里接受的是依赖对象参数
    abstract void execute(Object...objects);
}
