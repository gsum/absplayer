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
            int a = new Pitch('A').toMidiNote();
            int c = new Pitch('C').toMidiNote();
            int d = new Pitch('D').toMidiNote();
            int e = new Pitch('E').toMidiNote();
            int f = new Pitch('F').toMidiNote();
            int g = new Pitch('G').toMidiNote();
            int b = new Pitch('B').toMidiNote();

            // measure 1
            player.addNote(f, 0, 6);
            player.addNote(e, 6, 6);
            player.addNote(f, 12, 6);
            player.addNote(e, 18, 6);

            //z
            player.addNote(f, 24, 6);
            player.addNote(e, 30, 6);

            //z
            player.addNote(c, 36, 6);
            player.addNote(f, 42, 6);

            player.addNote(f, 48, 6);
            player.addNote(e, 54, 6);

            // measure 2
            player.addNote(g, 60, 6);
            player.addNote(b, 66, 6);
            player.addNote(g, 72, 6);

            //z
            player.addNote(g, 78, 6);

            //z
            // measure 3
            player.addNote(c, 84, 6);
            player.addNote(g, 90, 6);

            //rest
            player.addNote(e, 96, 6);

            //measure 4
            player.addNote(e, 102, 6);
            player.addNote(a, 108, 6);
            player.addNote(b, 114, 6);
            player.addNote(b, 120, 6);
            player.addNote(a, 126, 6);

            //measure 5
            player.addNote(g, 132, 6);
            player.addNote(e, 138, 6);
            player.addNote(g, 144, 6);
            player.addNote(a, 150, 6);
            player.addNote(f, 156, 6);
            player.addNote(g, 162, 6);

            //z
            //measure 6
            player.addNote(e, 168, 6);
            player.addNote(c, 174, 6);
            player.addNote(d, 180, 6);
            player.addNote(b, 186, 6);

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
