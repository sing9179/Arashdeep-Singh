/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roachpopulation;

/**
 *
 * @author Arashdeep Singh
 */
//Definition of the class Kitchen
public class Kitchen{
    
    //Definition of the main method
    public static void main(String[] args) {
      
        //Declaration of the object variable
        RoachPopulation population  = new RoachPopulation(10);
        
        //Declaration of the for loop from zero to the user requirement
        for(int i = 0; i < 4; i++){
            
            population .waitForDoubling();//Calling waitForDoubling method
            population.spray();//Calling spray method
            
            System.out.println((int)population.getRoaches() + " roaches");//Printing count of roaches
            
        }//End of the for loop
    }//End of the main method
}//End of the class Kitchen
