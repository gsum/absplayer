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

    @Test
    public void testPieceOne(){
        try {
            SequencePlayer player = new SequencePlayer(140, 12);

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

        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }
    

}
