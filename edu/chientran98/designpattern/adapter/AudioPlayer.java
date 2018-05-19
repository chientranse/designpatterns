package edu.chientran98.designpattern.adapter;

/**
 *
 * @author yeula
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3 file. File name: " + fileName);
        } else if (audioType.equals("vlc") || audioType.equals("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " is not supported");
        }
    }

}
