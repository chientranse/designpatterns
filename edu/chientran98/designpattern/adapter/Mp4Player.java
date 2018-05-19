package edu.chientran98.designpattern.adapter;

/**
 *
 * @author yeula
 */
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. File name: " + fileName);
    }

}
