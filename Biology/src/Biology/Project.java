/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

import java.util.Date;

/**
 *
 * @author kevm6_000
 */
public class Project extends CNotes {
    private Date deadline;
    
    public Project(String name, String type, int weighting, Date deadline){
        super(name, type, weighting);
        this.deadline = deadline;
        
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
