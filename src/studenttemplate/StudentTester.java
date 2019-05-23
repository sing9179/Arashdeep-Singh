/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 May23,2019
 Arashdeep Singh*/
package studenttemplate;

/**
 *
 * @author User
 */
public class StudentTester {
    
     public static void main(String[] args) {
        // TODO code application logic here 
        StudentTemplate s1 = new StudentTemplate("Arash" ,234);
        //s1.setName("Arash");
        //System.out.print(studentList.getName());
        
        StudentTemplate s2 = new StudentTemplate("Heman sandhu", 335);
        //s2.setName("Balraj");
        
        StudentTemplate s3 = new StudentTemplate("Balraj singh", 435) ;
        //s3.setName("Heman");
        
        StudentTemplate[] list = new StudentTemplate[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0; i<list.length; i++){
           System.out.println(list[i].getName()+"   " + list[i].getSid());
        }
      System.out.println("fetch example");
       System.out.println("fetch example");
    }
 
}
