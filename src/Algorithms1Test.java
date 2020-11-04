import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test // med fast seed der er 0:
    void randomBoyName() {
            Algorithms1 a1 = new Algorithms1();
            assertEquals("Awesome",a1.randomBoyName(0));

    }


    @Test
    void randomGirlName() {
        Algorithms1 a1 = new Algorithms1();
        assertEquals("Ae", a1.randomGirlName(0));




    }

    @Test
    void randomName() {

        Algorithms1 a1 = new Algorithms1();
        String[] manuelMadeNameArray = {"Ae","Aloha","Altan","Amen","Badr","Befri","Charme","Cirkel","Diddedarling","Dyne","Engel","Europa","Fan","Fe","Fri","Fryd","Gift","Gin","Glød","Gul","Hane","Harme","Håb","Kigge","Krushbakht","Malmfred","Manjabjørg","Musling","Myrtille","Nectaria","Nøks","Ninja","Nitte","Ny","Ok","Panda","Pil","Pop","Rikkepippih","Ryle","Sne","Soya","Tigerlilly","Tytte","Vølve","Awesome","Barc","Blær","Brormand","Bue","Cello","Cobra","Dreng","Faktor","Fru","Gandalf","Haj","Havand","Jazz","Jesus","Jura","Kamel","Klausbjerke","Kritte","Laban","Lillemann","Life","Lucky (kan endda kombineres med Luke)","Ludo","Lurifax","Memo","Muslim","Nam","Niks","Nord","Offer","Og","Piphat","Rocky","Skak","Skat","Snoopy","Sok","Sut","Syver","Sønnik","Tavs","Triumf","Tung","Viking"};
        boolean arrayTest = Arrays.equals(manuelMadeNameArray,a1.randomName());
        assertEquals(true,arrayTest);

    }
}