package xyz.makise.timeline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import xyz.makise.timeline.entity.PageView;

//@MapperScan("xyz.makise.timeline.dao")
@SpringBootApplication
public class TimelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimelineApplication.class, args);
    }

    @Bean
    public PageView pageViewInit(){
        return new PageView();
    }

}
