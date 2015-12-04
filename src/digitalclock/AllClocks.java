
package digitalclock;

import java.util.ArrayList;
import java.util.List;

public class AllClocks {
    private List<DigitalClock> clocks;
    
    public AllClocks() {
        clocks = new ArrayList<>();
    }
    public void add() {
        clocks.add(new DigitalClock());
    }
    public void advanceTimeonAll() {
        for(DigitalClock temp : clocks)
        {
            temp.advanceTime();
        }
    }
    public void removeDefective() {
        for(DigitalClock temp : clocks)
        {
            if(temp.isDefective())
                clocks.remove(temp);
        }
    }
    public void replaceDefective() {
        for(int i = 0;i<clocks.size();i++)
        {
            if(clocks.get(i).isDefective())
            {
                clocks.remove(i);
                clocks.add(i, new DigitalClock(12,30));
            }
        }
    }
}
