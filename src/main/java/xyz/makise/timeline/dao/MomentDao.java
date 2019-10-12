package xyz.makise.timeline.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.makise.timeline.entity.Moment;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@Mapper
public interface MomentDao {

    public ArrayList<Moment> getMoments(Integer offset);

    @Insert("insert into moment(author,timeStamp,content,imageUrl) values(#{author},#{timeStamp},#{content},#{imageUrl})")
    public void addMoment(Moment moment);
}
