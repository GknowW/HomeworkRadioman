import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationUnderMinBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationMinBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationAboveMinBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationUnderMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationAboveMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationSet(){
        Radio radio = new Radio(20);

        radio.setRadioStation(18);

        int expected = 18;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationSetWithMinus(){
        Radio radio = new Radio();

        radio.setRadioStation(-15);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeUnderMinBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMinBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(0);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeOverMinBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(1);

        int expected = 1;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeUnderMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(9);

        int expected = 9;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(100);

        int expected = 100;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeAboveMaxBorder(){
        Radio radio = new Radio();

        radio.setRadioVolume(101);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeSet(){
        Radio radio = new Radio();

        radio.setRadioVolume(3);

        int expected = 3;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNextFromMinBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNextToMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNextFromMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationPrevFromMinBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationPrevToMinBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationPrevFromMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumePlusFromMinBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(0);

        radio.volumePlus();

        int expected = 1;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumePlusToMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(99);

        radio.volumePlus();

        int expected = 100;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumePlusFromMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(100);

        radio.volumePlus();

        int expected = 100;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMinusFromMaxBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(100);

        radio.volumeMinus();

        int expected = 99;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
     @Test
    public void volumeMinusToMinBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(1);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusFromMinBorder(){
        Radio radio = new Radio();
        radio.setRadioVolume(0);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }


}
