package xyz.makise.timeline.entity;

import java.util.ArrayList;

public class PageView {
    private final int lineLimit = 50;
    private int wordsPerLine = 15;
    private boolean isPageOverFlow;
    private int momentCount = 0;

    public int getMomentCount() {
        return momentCount;
    }

    public void setMomentCount(int momentCount) {
        this.momentCount = momentCount;
    }

    private ArrayList<Moment> moments = new ArrayList<>();

    public int getWordsPerLine() {
        return wordsPerLine;
    }

    public void setWordsPerLine(int wordsPerLine) {
        this.wordsPerLine = wordsPerLine;
    }

    public int getLineLimit() {
        return lineLimit;
    }

    public boolean isPageOverFlow() {
        return isPageOverFlow;
    }

    public void setPageOverFlow(boolean pageOverFlow) {
        isPageOverFlow = pageOverFlow;
    }

    public ArrayList<Moment> getMoments() {
        return moments;
    }

    public void setMoments(ArrayList<Moment> moments) {
        this.moments = moments;
    }

    @Override
    public String toString() {
        return "PageView{" +
                "lineLimit=" + lineLimit +
                ", wordsPerLine=" + wordsPerLine +
                ", isPageOverFlow=" + isPageOverFlow +
                ", momentCount=" + momentCount +
                ", moments=" + moments +
                '}';
    }

    public void clear(){
        moments.clear();
        isPageOverFlow = false;
    }
}
