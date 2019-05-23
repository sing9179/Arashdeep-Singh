/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplate;

/**
 *
 * @author User
 */
public class StudentTemplate {
    
    //Data fields
    private String name;
    
    private int sid;
    /**
     * @return the name
     */
   //constructors
    public StudentTemplate(String name, int s){
        this.name = name;
        this.sid =s;
        private int Maxcourse;

    /**
     * @return the Maxcourse
     */
    public int getMaxcourse() {
        return Maxcourse;
    }

    /**
     * @param Maxcourse the Maxcourse to set
     */
    public void setMaxcourse(int Maxcourse) {
        this.Maxcourse = Maxcourse;
    }
    }
    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
    /**
     * @param args the command line arguments
     */
    
}
