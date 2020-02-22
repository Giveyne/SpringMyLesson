package ru.ershov.springlesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
//@Component
//@PropertySource("classpath:musicPlayer.properties")
public class MusicPlayer {
    //@Autowired
    private List<Music> musicList = new ArrayList<>();

    private String name;
    //@Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList, String name, int volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }

    public MusicPlayer() {
    }
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }
    public List<Music> getMusicList() {
        return musicList;
    }
   //    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        Random random = new Random();
        ListMusic randomMusic = ListMusic.values()[random.nextInt(ListMusic.values().length)];
        switch (randomMusic){
            case CLASSICAL:
                System.out.println(musicList.get(0).getSong());
                            break;
            case ROCKING:
                System.out.println(musicList.get(1).getSong());
                            break;
                            default:
                                System.out.println("нет такого");
        }

    }


    enum ListMusic{
        CLASSICAL,
        ROCKING
    }

}
