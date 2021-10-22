//Abdulkareem Abdulfatai
package chapterThree;

public class AirConditioner {

    private boolean isOn;
    private int temperature;


    public AirConditioner() {

    }

    public void iturniton(boolean itIsOn) {
        boolean on = true;
        boolean off = false;
        if (on == false) {
            System.out.print("AC is On");
        }

    }

    public boolean isOn() {

        return isOn;
    }

    public void whenITurnItOff(boolean itIsOff) {
        if (itIsOff == true) ;

    }

    public void whenIIncreaseTemperature(int temperatureIncrease) {
        if(temperatureIncrease < 30);
        int finalTemperature =  temperatureIncrease;
    }

    public int getTemperature(){
        return temperature;
    }

    public void whenIDecreaseTemperature( int temperatureDecrease) {

        if(temperatureDecrease > 16);
    }

    public void whenIIncreaseTemperatureBeyond30(int tempIsStill30) {
        if(tempIsStill30 >= 30){
            System.out.println("Temperature is still 30");
        }
        else;
    }

    public void whenIDecreaseTemperatureBelow16(int tempBelow16) {
        if(tempBelow16 <= 30){
            System.out.println("Temperature is still 16");
        }
    }
}