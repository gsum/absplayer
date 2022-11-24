package abc.sound;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class SequencePlayerTest {

    // TODO: warmup #2
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }

    // Written by Cameron
    @Test
    public void testPieceOne(){
        try {
            SequencePlayer player = new SequencePlayer(140, 12);

            int c = new Pitch('C').toMidiNote();
            int d = new Pitch('D').toMidiNote();
            int e = new Pitch('E').toMidiNote();
            int f = new Pitch('F').toMidiNote();
            int g = new Pitch('G').toMidiNote();
            int highC = new Pitch('C').transpose(12).toMidiNote();

            // measure 1
            player.addNote(c, 0, 12);
            player.addNote(c, 12, 12);
            player.addNote(c, 24, 9);
            player.addNote(d, 33, 3);
            player.addNote(e, 36, 12);
            // measure 2
            player.addNote(e, 48, 9);
            player.addNote(d, 57, 3);
            player.addNote(e, 60, 9);
            player.addNote(f, 69, 3);
            player.addNote(g, 72, 24);
            // measure 3
            player.addNote(highC, 96, 4);
            player.addNote(highC, 100, 4);
            player.addNote(highC, 104, 4);
            player.addNote(g, 108, 4);
            player.addNote(g, 112, 4);
            player.addNote(g, 116, 4);
            player.addNote(e, 120, 4);
            player.addNote(e, 124, 4);
            player.addNote(e, 128, 4);
            player.addNote(c, 132, 4);
            player.addNote(c, 136, 4);
            player.addNote(c, 140, 4);
            // measure 4
            player.addNote(g, 144, 9);
            player.addNote(f, 153, 3);
            player.addNote(e, 156, 9);
            player.addNote(d, 165, 3);
            player.addNote(c, 168, 24);

            System.out.println(player);

            player.play();
        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testPieceTwo(){
        try {
            SequencePlayer player = new SequencePlayer(200, 12);
            // first octave notes
            int a = new Pitch('A').toMidiNote();
            int b = new Pitch('B').toMidiNote();
            int bFlat = new Pitch('B').transpose(-1).toMidiNote();
            int e = new Pitch('E').toMidiNote();
            int fSharp = new Pitch('F').transpose(1).toMidiNote();
            int g = new Pitch('G').toMidiNote();
            // second octave notes
            int highC = new Pitch('C').transpose(12).toMidiNote();
            int highD = new Pitch('D').transpose(12).toMidiNote();
            int highE = new Pitch('E').transpose(12).toMidiNote();
            int highF = new Pitch('F').transpose(12).toMidiNote();
            int highG = new Pitch('G').transpose(12).toMidiNote();
            int highA = new Pitch('A').transpose(12).toMidiNote();

            // measure 1
            player.addNote(fSharp, 0, 6);
            player.addNote(highE, 0, 6);
            player.addNote(fSharp, 6, 6);
            player.addNote(highE, 6, 6);

            //z 12-18
            player.addNote(fSharp, 18, 6);
            player.addNote(highE, 18, 6);

            //z 24-30
            player.addNote(fSharp, 30, 6);
            player.addNote(highC, 30, 6);

            player.addNote(fSharp, 36, 12);
            player.addNote(highE, 36, 12);

            // measure 2
            player.addNote(highG, 48, 12);
            player.addNote(b, 48, 12);
            player.addNote(g, 48, 12);

            //z 60-72
            player.addNote(g, 72, 12);

            //z 84-96
            // measure 3
            player.addNote(highC, 96, 18);
            player.addNote(g, 114, 6);

            //rest 120-132
            player.addNote(e, 132, 12);

            //measure 4
            player.addNote(e, 144, 6);
            player.addNote(a, 150, 12);
            player.addNote(b, 162, 12);
            player.addNote(bFlat, 174, 6);
            player.addNote(a, 180, 12);

            //measure 5
            player.addNote(g, 192, 8);
            player.addNote(highE, 200, 8);
            player.addNote(highG, 208, 8);
            player.addNote(highA, 216, 12);
            player.addNote(highF, 228, 6);
            player.addNote(highG, 234, 6);

            //measure 6
            //z 240-246
            player.addNote(highE, 246, 12);
            player.addNote(highC, 258, 6);
            player.addNote(highD, 264, 6);
            player.addNote(b, 270, 9);

            //rest
            System.out.println(player);
            player.play();

        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }
    

}
