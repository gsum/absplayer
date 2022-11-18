package abc.sound;

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import org.junit.Test;

public class SequencePlayerTest {

    // TODO: warmup #2
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }
    
    // test Piece No.1
    @Test
    public void testPiece1() {
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

            // play
            player.play();
        } catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            imde.printStackTrace();
        }
    }

}
