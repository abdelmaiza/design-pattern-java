package dz.cirta.designspattern.adapter;

/**
 * Created by b010nsm on 13/11/2018.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase( "mp4")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
