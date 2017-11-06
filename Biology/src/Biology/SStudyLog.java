/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

/**
 *
 * @author Laura Nesbitt
 */
public class SStudyLog {

    //declare variables

    private String Name;
    private String Day;
    private String Start;
    private String Finish;

    public SStudyLog() {
        //initialse variables
        Name = new String();
        Day = new String();
        Start = new String();
        Finish = new String();
    }
//get and set methods

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String Start) {
        this.Start = Start;
    }

    public String getFinish() {
        return Finish;
    }

    public void setFinish(String Finish) {
        this.Finish = Finish;
    }

}
