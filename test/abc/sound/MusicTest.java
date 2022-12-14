package abc.sound;

import abc.player.Main;
import org.junit.Test;

public class MusicTest {
    /*
        * Test strategy:
        * Play a sample of different songs to show the ability of the music player
        * to play different songs from simple to complex
     */

    String directory = "sample_abc/";

    @Test
    public void testPlaySampleOne() throws InterruptedException {
        String filename = "sample1.abc";
        Main.play(directory + filename);
        Thread.sleep(100);
    }

    @Test
    public void testPlaySampleTwo() throws InterruptedException {
        String filename = "sample2.abc";
        Main.play(directory + filename);
        Thread.sleep(100);
    }

    @Test
    public void testPlaySampleThree() throws InterruptedException {
        String filename = "sample3.abc";
        Main.play(directory + filename);
        Thread.sleep(100);
    }

    @Test
    public void testPlaySimpleSong() throws InterruptedException {
        String filename = "scale.abc";
        Main.play(directory + filename);
        Thread.sleep(100);
    }

    @Test
    public void testPlayInvention() throws InterruptedException {
        String filename = "invention.abc";
        Main.play(directory + filename);
        Thread.sleep(1000);
    }

    @Test
    public void playLittleNightMusic() throws InterruptedException {
        String filename = "little_night_music.abc";
        Main.play(directory + filename);
        Thread.sleep(1000);
    }

    @Test
    public void playFurElise() throws InterruptedException {
        String filename = "fur_elise.abc";
        Main.play(directory + filename);
        Thread.sleep(1000);
    }

}
