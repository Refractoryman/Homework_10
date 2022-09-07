package ru.netology.javaqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void testNextRadioStation1() {

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testNextRadioStation2() {

        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testNextRadioStation3() {

        radio.setCurrentRadioStation(-2);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testPrevRadioStation1() {

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testPrevRadioStation2() {

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testPrevRadioStation3() {

        radio.setCurrentRadioStation(12);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp1() {

        radio.setVolume(0);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp2() {

        radio.setVolume(10);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp3() {

        radio.setVolume(14);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown1() {

        radio.setVolume(5);
        radio.volumeDown();

        int expected = 4;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown2() {

        radio.setVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown3() {

        radio.setVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}

