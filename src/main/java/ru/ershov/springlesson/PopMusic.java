package ru.ershov.springlesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("popMusic")
public class PopMusic implements Music{
   // @Autowired
    //@Qualifier("popMusic")
    private static List<String> listClassicalMusic = new ArrayList<>();
    static  {
        listClassicalMusic.add("Michael Jackson");
        listClassicalMusic.add("Philip Kirkorov");
        listClassicalMusic.add("Like a prayer");
    }
    public PopMusic() {
    }
    //@Bean
    //@Qualifier("popMusic")
    public String getSongJackson() {
        return "Michael Jackson";
    }
    //@Bean
    //@Qualifier("popMusic")
    public String getSongKirkorov(){ return "Philip Kirkorov";}
   // @Bean
    //@Qualifier("popMusic")
    public String getSongMadonna(){ return "Like a prayer";}

    @Override
    public String getSong() {
        return listClassicalMusic.get((int)(Math.random()*listClassicalMusic.size()));
    }
}
