/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author Arashdeep Singh
 */
public class Card {

    /**
     * @param args the command line arguments
     */
    public enum Suit{RED, YELLOW, GREEN, BLUE};
    private Suit s;
    public enum Value{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};
    private Value v;
    public Card(Suit su,Value va)
    {
        this.s = su;
        this.v = va;
    }
    
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }

    /**
     * @param args the command line arguments
     */
    /*
    OO principles that I used in card class:
    1.Coupling 
    2.Delegation
    3.Encapsulation
    4.Cohesion
    
    Feature of the code that will allow me Card class to be reused or extended in another program:
    1.Encapsultion, Composition, Association
    */
   
    
}
