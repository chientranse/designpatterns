package edu.chientran98.designpattern.adapter;

/**
 *
 * @author yeula
 */
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. File name: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // do nothing
    }

}
