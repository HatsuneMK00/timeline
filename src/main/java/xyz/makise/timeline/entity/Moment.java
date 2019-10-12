package xyz.makise.timeline.entity;

import java.sql.Timestamp;

public class Moment {
    private String author;
    private Timestamp timeStamp;
    private String content;
    private String imageUrl;
//    这个属性封装不进数据库
    private Integer lineCount;

    @Override
    public String toString() {
        return "Moment{" +
                "author='" + author + '\'' +
                ", timeStamp=" + timeStamp +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", lineCount=" + lineCount +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }
}
