import java.util.*;

public class StepTracker{
    private int steps;
    private int days;
    private int active; //num of active days
    private int minActive; //the min amount required to be considered an active day
    public StepTracker(int a){
        active = 0;
        steps = 0;
        days = 0;
        minActive = a;
    }
    
    //accumulates info about steps, in readings taken once per day
    public void addDailySteps(int s){
        steps+=s;
        days++;
        if(s>=minActive){
            active++;
        }
    }
    
    //returns the num of active days
    public int activeDays(){
        return active;
    }
    
    //returns the averages num of steps per day calculated by dividing the total num of steps taken by num of days tracked
    public double averageSteps(){
        return steps/days;
    }
}