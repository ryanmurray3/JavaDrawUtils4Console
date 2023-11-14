package Utils.ShapesToDrawInConsole;

import java.awt.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class TestFrame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame 1");
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        playMusic();
    }

    public static void playMusic() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(TestFrame1.class.getResourceAsStream("music.wav"));//sub the music.wav for your sound file
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

