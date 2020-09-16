/*
 * Date: 16/09/2020
 * Student Number: 11001826
 * Student Name: Connor Macleod 
 * Version:  1
 */

package pontoonweek2challenge;

import java.util.Scanner;



public class Cards {
	
public static Scanner keyboard = new Scanner(System.in);
static Scanner kboard = new Scanner(System.in);	

		
    public static int getRandomNumber()   //Grabs a random value for a card
			{
			return (int)(Math.random()*10 + 1);
			}

	
	
    public static int calcTotal(int card1,int card2) //returns total of cards 1 and 2
		{
		return(card1+card2);
		}
	

    public static boolean busted(int total) //returns the result of user cards if over 21
				{
				if (total>21)
					return(true);
				else
					return(false);
				}
	
	   
    public static void displayCards(int cardsDrawn[]) //returns the values of each card drawn
		{
    	System.out.print("Cards drawn: ");
			for (int x = 1;x<10;x++)
				{
				if (cardsDrawn[x]!=0)
					if (x==1)
				System.out.print(cardsDrawn[x]);
			else
				System.out.print(","+cardsDrawn[x]);	
				}
			System.out.println(); 
		}	
			


} // End of class

	
	

