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
public class StudentTester {
    
     public static void main(String[] args) {
        // TODO code application logic here 
        StudentTemplate s1 = new StudentTemplate("Arash");
        //s1.setName("Arash");
        //System.out.print(studentList.getName());
        
        StudentTemplate s2 = new StudentTemplate("Heman");
        //s2.setName("Balraj");
        
        StudentTemplate s3 = new StudentTemplate("Balraj") ;
        //s3.setName("Heman");
        
        StudentTemplate[] list = new StudentTemplate[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0; i<list.length; i++){
           System.out.println(list[i].getName());
        }
    }
}
