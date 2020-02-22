package ru.ershov.springlesson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

       /* Iterator <Music> iterator = musicPlayer.getMusicList().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getSong());
        }*/

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());


        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("Classical music play is: " + classicalMusic.getSong());

      PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        System.out.println("Pop music play is: " + popMusic.getSong());



        context.close();
    }
}
