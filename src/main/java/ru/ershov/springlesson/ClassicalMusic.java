package ru.ershov.springlesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("classicalMusic")
public class ClassicalMusic implements Music {

    //@Autowired
   // @Qualifier("classicBean")
    private static List<String> listClassicalMusic = new ArrayList<>();
   static  {
        listClassicalMusic.add("Hungarian Rhapsody");
        listClassicalMusic.add("Symphony №7");
        listClassicalMusic.add("Appeal to Elise");
    }
    public ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    //@Bean
    //@Qualifier("classicBean")
    public String getSongRhapsody() {
        return "Hungarian Rhapsody";
    }
   // @Bean
    //@Qualifier("classicBean")
    public String getSongMozart(){ return "Symphony №7";}
   // @Bean
    //@Qualifier("classicBean")
    public String getSongBah(){ return "Appeal to Elise";}

    @Override
    public String getSong() {
        return listClassicalMusic.get((int)(Math.random()*listClassicalMusic.size()));
    }
}

