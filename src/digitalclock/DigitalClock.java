
package digitalclock;

public class DigitalClock {

    private int hours;
    private int minutes;
    
    public DigitalClock() {
        hours = 12;
        minutes = 0;
    }
    public DigitalClock(int _hour, int _minute) {
        hours = _hour;
        minutes = _minute;
    }
    public void advanceTime() {
        minutes++;
        if(minutes == 60)
        {
            hours++;
            minutes = 0;
        }
    }
    public boolean isDefective() {
        return true;
    }
}
