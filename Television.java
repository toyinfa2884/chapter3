package chapterThree;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;
    private int screenSize;

    public void setOn(boolean powerOnTv) {

        isOn = powerOnTv;
    }

    public boolean getIsOn() {

        return isOn;
    }


    public void channels(int searchChannel) {
        channel = searchChannel;
        for(channel = 30; channel < 30; channel--);
    }

    public int getChannel() {

        return channel;
    }

    public void changeVolume(int changeVolume) {
        volume = changeVolume;
        for(volume = 15; volume < 15; volume--);
    }

    public int getVolume() {
        return volume;
    }

    public void screenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void addChannel( int addMoreChannels) {
        channel = channel + addMoreChannels;
    }

    public void deleteChannel( int deleChannel) {
        channel = channel - deleChannel;
    }


    public void decreaseVolume(int decreVolume) {
        volume = volume - decreVolume;
    }
}
