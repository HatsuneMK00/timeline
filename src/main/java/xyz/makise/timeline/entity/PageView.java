package xyz.makise.timeline.entity;

import java.util.ArrayList;

public class PageView {
    private final int lineLimit = 25;
    private int wordsPerLine = 15;
    private boolean isPageOverFlow;
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
                ", moments=" + moments +
                '}';
    }

    public void clear(){
        moments.clear();
        isPageOverFlow = false;
    }
}
