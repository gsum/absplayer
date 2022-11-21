package abc.sound;

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class SequencePlayerTest {

    
    @Test
    public void piece1Test() {
        try {
            SequencePlayer player = new SequencePlayer(120, 2);

            assertEquals(1,1);
            assertEquals(1,1);

            player.addNote(new Pitch('C').toMidiNote(), 0, 1);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 7, 1);

            System.out.println(player);

            player.play();


        } catch (MidiUnavailableException mue) {
            fail("MidiUnavailableException");
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            fail("InvalidMidiDataException");
            imde.printStackTrace();
        }
    }
    
    @Test
    public void piece2Test() {
        try {
            SequencePlayer player = new SequencePlayer(120, 2);

            assertEquals(1,1);
            assertEquals(1,1);

            player.addNote(new Pitch('C').toMidiNote(), 0, 1);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 7, 1);

            System.out.println(player);

            player.play();


        } catch (MidiUnavailableException mue) {
            fail("MidiUnavailableException");
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            fail("InvalidMidiDataException");
            imde.printStackTrace();
        }
    }

}
