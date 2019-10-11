package xyz.makise.timeline.service;

import xyz.makise.timeline.entity.PageView;

public class RefreshMomentCommand extends Command {
    @Override
    void execute(Object...objects) {
        PageView pageView = (PageView) objects[0];
        pageView.clear();

    }
}
