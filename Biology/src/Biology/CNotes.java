package Biology;

/**
 * Assessment.java
 * @author K.Maher
 * 15th Feb 2015
 */
public class CNotes {
    private String subject, chapter;
    private int summary;
    
    public CNotes(){
        subject = new String();
        chapter = new String();
        summary = 0;
    }

    public CNotes(String subject, String chapter, int summary){
        this.subject = subject;
        this.chapter = chapter;
        this.summary = summary;
    }
    
    public String getName() {
        return subject;
    }

    public void setName(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return chapter;
    }

    public void setType(String chapter) {
        this.chapter = chapter;
    }

    public int getWeighting() {
        return summary;
    }

    public void setWeighting(int summary) {
        this.summary = summary;
    }
    
    public String getDetails(){
        return "\nName: " + subject + "\nType: " + chapter + "\nWeighting: " + summary + "%";
    }
    
    //create a change duration method
    public void changeDuration(CNotes a, int duration){
        
        //if a is an instance of Test
        if(a instanceof  CNotesTest){
            //create a new test, t, to put a into
            CNotesTest t = (CNotesTest)a;
            t.setDuration(duration);
        } 
    }
}
