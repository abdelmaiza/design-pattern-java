package dz.cirta.designspattern.creational.adapter;

/**
 * Created by b010nsm on 13/11/2018.
 */
public class Mp4Player implements AdvencedMediaPlayer{

    public void playVlc(String fileName) {
        // do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
