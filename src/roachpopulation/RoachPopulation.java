/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Arashdeep singh
 */
package roachpopulation;

/**
 *
 * @author Arashdeep Singh
 */
//Definition of the class RoachPopulation
public class RoachPopulation {
    
    //Field variable
    private double _number;
    
    //Constructor of RoachPopulation
    public RoachPopulation(double number){
        this._number = number;
    }
    //Declaration of waitForDoubling method
    public void waitForDoubling(){
        this._number = this._number * 2;//Doubling population
    }
    //Declaration of spray method
    public void spray(){
        this._number = (int)(this._number - (this._number / 10));//reducing population by 10%
    }
    //Declaration of getRoaches method
    public double getRoaches(){
        return this._number;//returning number
    }
    /**
     * @param args the command line arguments
     */
}//End of the class RoachPopulation
