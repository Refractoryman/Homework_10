package ru.netology.javaqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldQuantityRadioStation() {

        radio.setQuantityRadioStation(10);
        assertEquals(10, radio.getQuantityRadioStation());
    }


    @Test
    void shouldChooseRadioStation1() {

        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getNumberRadioStation());
    }
    @Test
    void shouldChooseRadioStation2() {

        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getNumberRadioStation());
    }

    @Test
    void shouldChooseMaxRadioStation() {

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    void shouldChooseMinRadioStation() {

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    void testRadioStation1() {

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void testRadioStation2() {

        radio.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void testRadioStation3() {

        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void testRadioStation4() {

        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void setToMaxRadioStation() {

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void  setToMinRadioStation() {

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChooseMaxVolume() {

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void shouldChooseMinVolume() {

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setToMaxVolume() {

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setToMinVolume() {

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testVolumeUp1() {

        radio.setCurrentVolume(50);
        radio.volumeUp();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp2() {

        radio.setCurrentVolume(100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown1() {

        radio.setCurrentVolume(99);
        radio.volumeDown();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown2() {

        radio.setCurrentVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolume1() {

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolume2() {

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolume3() {

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolume4() {

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void testNextRadioStation1() {

        radio.setCurrentRadioStation(5);
        assertEquals(6, radio.nextRadioStation());
    }

    @Test
    void testNextRadioStation2() {

        radio.setCurrentRadioStation(0);
        assertEquals(1, radio.nextRadioStation());
    }

    @Test
    void testNextRadioStation3() {

        radio.setCurrentRadioStation(9);
        assertEquals(0, radio.nextRadioStation());
    }

    @Test
    void testPrevRadioStation1() {

        radio.setCurrentRadioStation(5);
        assertEquals(4,radio.prevRadioStation());
    }

    @Test
    void testPrevRadioStation2() {

        radio.setCurrentRadioStation(10);
        assertEquals(9,radio.prevRadioStation());
    }

}

