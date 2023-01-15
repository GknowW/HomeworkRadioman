package org.example;

public class Radio {
    private int radioStation;
    private int radioVolume;

    public void next() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;
        } else {
            radioStation = 0;
        }
    }

    public void prev() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        } else {
            radioStation = 9;
        }
    }

    public void volumePlus() {
        if (radioVolume < 10) {
            radioVolume = radioVolume + 1;
        } else {
            return;
        }
    }

    public void volumeMinus() {
        if (radioVolume > 0) {
            radioVolume = radioVolume - 1;
        } else {
            return;
        }
    }


    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 10) {
            return;
        }
        this.radioVolume = radioVolume;
    }


}

