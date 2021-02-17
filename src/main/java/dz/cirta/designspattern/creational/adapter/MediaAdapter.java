package dz.cirta.designspattern.creational.adapter;

/**
 * Created by b010nsm on 13/11/2018.
 */
public class MediaAdapter implements MediaPlayer {

    AdvencedMediaPlayer advencedMusicPlayer;

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advencedMusicPlayer = new VlcPlayer();
            advencedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advencedMusicPlayer = new Mp4Player();
            advencedMusicPlayer.playMp4(fileName);
        }
    }
}
