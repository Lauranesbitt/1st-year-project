package Biology;

import java.io.Serializable;

/*
 * CQuizCreate
 * @author K.Maher
 * 20-Apr-2015
 */
public class CQuizCreate implements Serializable {

    //declare variables
    private String qs, chap, ans;
    private double percent;

    //constructor
    public CQuizCreate() {
        qs = new String();
        chap = new String();
        ans = new String();
        percent = 0.0;
    }

    //get and set methods
    public String getName() {
        return qs;
    }

    public void setName(String qs) {
        this.qs = qs;
    }

    public String getType() {
        return chap;
    }

    public void setType(String chap) {
        this.chap = chap;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public double getWeighting() {
        return percent;
    }

    public void setWeighting(double percent) {
        this.percent = percent;
    }
}
