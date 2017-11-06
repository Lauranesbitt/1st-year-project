/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

/**
 *
 * @author kevm6_000
 */
public class CNotesTest extends CNotes {

    private int duration;

    public CNotesTest(String subject, String chapter, int summary, int duration) {
        super(subject, chapter, summary);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + "\nDuration: " + duration + "\nNumber of Questions: ";
    }

}
