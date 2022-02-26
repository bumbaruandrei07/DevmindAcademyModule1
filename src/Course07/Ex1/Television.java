package Course07.Ex1;

public class Television {


    double width;
    double height;
    double screenSize;
    int maxVolume;
    int volume;
    boolean power;

    public Television(double width, double height, double screenSize) {
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
    }


    public double channelTuning(int channel) {
        switch (channel) {
            case 1:
                return 29.45;
            case 2:
                return 47.41;
            case 3:
                return 39.12;
            case 4:
                return 56.81;
            case 5:
                return 49.12;
        }
        return 0;
    }

    public void powerSwitch() {
        this.power = !power;
    }

    int increaseVolume() {
        if (maxVolume > volume) volume++;
        return volume;
    }

    int decreaseVolume() {
        if (0 < volume) volume--;
        return volume;
    }

}

