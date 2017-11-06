/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biology;

/**
 *
 * @author karry
 */
public class OResults {
    private String Q1ans;
    private String Q2ans;
    private String Q3ans;
    private String Q4ans;
    private String Q1res;
    private String Q2res;
    private String Q3res;
    private String Q4res;
    
    public OResults(){
        
        Q1ans = new String();
        Q2ans = new String();
        Q3ans = new String();
        Q4ans = new String();
        Q1res = " ";
        Q2res = " ";
        Q3res = " ";
        Q4res = " ";
    }
 
    public String getQ1ans(){
        return Q1ans;
    }
    public String getQ2ans(){
        return Q2ans;
    }
    public String getQ3ans(){
        return Q3ans;
    }
    public String getQ4ans(){
        return Q4ans;
    }
    
    
    public String getQ1res(){
        return Q1res;
    }
    public String getQ2res(){
        return Q2res;
    }
    public String getQ3res(){
        return Q3res;
    }
    public String getQ4res(){
        return Q4res;
    }
    
    
    
    public void setQ1ans(String Q1ans){
        this.Q1ans = Q1ans;
    }
     public void setQ2ans(String Q2ans){
        this.Q2ans = Q2ans;
    }
      public void setQ3ans(String Q3ans){
        this.Q3ans = Q3ans;
    }
       public void setQ4ans(String Q4ans){
        this.Q4ans = Q4ans;
    }
    
    
    public void setQ1res(String Q1res){
        this.Q1res = Q1res;
    }
    public void setQ2res(String Q2res){
        this.Q2res = Q2res;
    }
    public void setQ3res(String Q3res){
        this.Q3res = Q3res;
    }
    public void setQ4res(String Q4res){
        this.Q4res = Q4res;
    }
    
}
