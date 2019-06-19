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
public class GamePlayer {
     public static void main(String[] args){
        CardHand ch = new CardHand();
        ch.generate();//calling
        for( Card c :ch.deck){
            System.out.println(c.getS() + "  " + c.getV());
        }
        
    }
}
