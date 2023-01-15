import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test1(){
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        Radio radio = new Radio();

        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        Radio radio = new Radio();

        radio.setRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        Radio radio = new Radio();

        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        Radio radio = new Radio();

        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        Radio radio = new Radio();

        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test7(){
        Radio radio = new Radio();

        radio.setRadioStation(3);

        int expected = 3;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test8(){
        Radio radio = new Radio();

        radio.setRadioStation(-15);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test9(){
        Radio radio = new Radio();

        radio.setRadioStation(15);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test10(){
        Radio radio = new Radio();

        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test11(){
        Radio radio = new Radio();

        radio.setRadioVolume(0);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test12(){
        Radio radio = new Radio();

        radio.setRadioVolume(1);

        int expected = 1;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test13(){
        Radio radio = new Radio();

        radio.setRadioVolume(9);

        int expected = 9;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test14(){
        Radio radio = new Radio();

        radio.setRadioVolume(10);

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test15(){
        Radio radio = new Radio();

        radio.setRadioVolume(11);

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test16(){
        Radio radio = new Radio();

        radio.setRadioVolume(3);

        int expected = 3;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test17(){
        Radio radio = new Radio();

        radio.setRadioVolume(-15);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test18(){
        Radio radio = new Radio();

        radio.setRadioVolume(15);

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test19(){
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test20(){
        Radio radio = new Radio();
        radio.setRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test21(){
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test22(){
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test23(){
        Radio radio = new Radio();
        radio.setRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test24(){
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test25(){
        Radio radio = new Radio();
        radio.setRadioVolume(0);

        radio.volumePlus();

        int expected = 1;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test26(){
        Radio radio = new Radio();
        radio.setRadioVolume(9);

        radio.volumePlus();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test27(){
        Radio radio = new Radio();
        radio.setRadioVolume(10);

        radio.volumePlus();

        int expected = 10;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test28(){
        Radio radio = new Radio();
        radio.setRadioVolume(10);

        radio.volumeMinus();

        int expected = 9;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test29(){
        Radio radio = new Radio();
        radio.setRadioVolume(10);

        radio.volumeMinus();

        int expected = 9;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test30(){
        Radio radio = new Radio();
        radio.setRadioVolume(1);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test31(){
        Radio radio = new Radio();
        radio.setRadioVolume(1);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test32(){
        Radio radio = new Radio();
        radio.setRadioVolume(0);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }


}
