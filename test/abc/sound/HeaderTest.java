package abc.sound;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class HeaderTest {

    //Test tostring method for one voice
    @Test
    public void testToStringOneVoice() {
        //Add one voice to voices map
        Map<String, List<String>> voicesMap = new HashMap<>();
        List<String> voiceList = new ArrayList<>();
        voiceList.add("G2 | E2 | C2 | D2 |");
        voicesMap.put("1", voiceList);

        Header header = new Header("TestOne", "1000", "C", "Nik", "3/4",
                "1/4", "1/16", 140, voicesMap);
        String expected = "X: 1000\nT: TestOne\nC: Nik\nL: 1/4\nM: 3/4\nQ: 1/16=140\nV: 1\nK: C" ;
        assertEquals("Base test to ensure correct string output", expected, header.toString());
    }

    //Test tostring method for multiple voices
    @Test
    public void testToStringMultipleVoices() {
        //Add multiple voices to voices map
        Map<String, List<String>> voicesMap = new HashMap<>();
        List<String> voiceList1 = new ArrayList<>();
        voiceList1.add("G2 | E2 | C2 | D2 |");
        voicesMap.put("1", voiceList1);
        List<String> voiceList2 = new ArrayList<>();
        voiceList2.add("G2 | E2 | C2 | D2 |");
        voicesMap.put("2", voiceList2);

        Header header = new Header("TestTwo", "1000", "D", "Nik", "3/4",
                "1/4", "1/16", 140, voicesMap);
        String expected = "X: 1000\nT: TestTwo\nC: Nik\nL: 1/4\nM: 3/4\nQ: 1/16=140\nV: 1\nV: 2\nK: D";
        assertEquals("Test to ensure the ability of the header class to deal with multiple voices",
                expected, header.toString());
    }

    //Test tostring method for multiple voices with different lengths
    @Test
    public void testToStringMultipleVoicesDifferentLengths() {
        //Add multiple voices to voices map
        Map<String, List<String>> voicesMap = new HashMap<>();
        List<String> voiceList1 = new ArrayList<>();
        voiceList1.add("G2 | E2 | C2 | D2 |");
        voicesMap.put("1", voiceList1);
        List<String> voiceList2 = new ArrayList<>();
        voiceList2.add("G2 | E2 | C2 | D2 | G2 | E2 | C2 | D2 |");
        voiceList2.add("G2 | E2 | C2 | D2 | C2 | D2");
        voicesMap.put("2", voiceList2);

        Header header = new Header("TestThree", "1000", "C", "Nik", "3/4",
                "1/4", "1/16", 140, voicesMap);
        String expected = "X: 1000\nT: TestThree\nC: Nik\nL: 1/4\nM: 3/4\nQ: 1/16=140\nV: 1\nV: 2\nK: C";
        assertEquals("Test to ensure the ability of the header class to deal with multiple voices of different lengths",
                expected, header.toString());
    }

    //Test different Headers
    @Test
    public void testDifferentHeaders() {
        //Add multiple voices to voices map
        Map<String, List<String>> voicesMap = new HashMap<>();
        List<String> voiceList1 = new ArrayList<>();
        voiceList1.add("G2 | E2 | C2 | D2 |");
        voicesMap.put("1", voiceList1);

        Header header1 = new Header("TestFour", "1000", "C", "Nik", "3/4",
                "1/4", "1/16", 140, voicesMap);
        Header header2 = new Header("TestFourPoint2", "1000", "E", "Nik", "3/4",
                "1/8", "1/16", 120, voicesMap);

        assertNotEquals("These headers should not be the same", header1, header2);
    }
}
