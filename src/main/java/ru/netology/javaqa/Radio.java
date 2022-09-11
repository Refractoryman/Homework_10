package ru.netology.javaqa;

public class Radio {
    public int minRadioStation = 0;
    public int maxRadioStation = 9;
    public int currentRadioStation;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentVolume;
    public int quantityRadioStation = 10;


    public Radio(int minRadioStation, int maxRadioStation, int currentRadioStation,
                 int minVolume, int maxVolume, int currentVolume) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }
    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public void setQuantityRadioStation(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getNumberRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        currentRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        currentRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        currentVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        currentVolume = minVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            return;
        }
    }

    public int nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }
    public int prevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        return currentRadioStation;
    }
}

