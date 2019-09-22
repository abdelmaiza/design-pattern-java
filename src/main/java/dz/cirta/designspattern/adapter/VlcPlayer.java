package dz.cirta.designspattern.adapter;

/**
 * Created by b010nsm on 13/11/2018.
 */
public class VlcPlayer implements AdvencedMediaPlayer{

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        // do nothing
    }
}
