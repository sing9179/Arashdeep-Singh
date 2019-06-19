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
public class CardHand {
     private int size = 60;
    Card[] deck = new Card[size];//array of the objects
    public void generate(){
        //for each loop
        int counter = 0;
        for( Card.Suit s : Card.Suit.values()  )
        {
             for( Card.Value v : Card.Value.values()  )
             {
            deck[counter] = new Card(s,v);
            counter++;
        }
        }
    }
    
}
