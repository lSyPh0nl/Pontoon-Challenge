/*
 * Date: 16/09/2020
 * Student Number: 11001826
 * Student Name: Connor Macleod 
 * Version:  1
 */

package pontoonweek2challenge;

import java.util.Scanner;



public class PontoonGame {
	
    public static Scanner keyboard = new Scanner(System.in);
    static Scanner kboard = new Scanner(System.in);
    
  
	


	public void startGame() {
	
	final int minHouse = 16; 
	String choice="";
	int drawnCards[] = new int[10]; // max amount of cards that can be drawn = 7 
	int card1 = 0;
	int card2 = 0;
	int house = 0;
	int total;
	int cardvalue = 0;
	int cardCount = 3; //counts card numbers
	

	
	house = House.houseTotal(minHouse); //The houses cards
	drawnCards[0] = house;              //Cards Drawn
	card1 = Cards.getRandomNumber();    //Grabs a random value for a card
	drawnCards[1] = card1;
	card2 = Cards.getRandomNumber();
	drawnCards[2] = card2;
	total = Cards.calcTotal(card1,card2); // Calculates the total of cards drawn
	System.out.println("You have drawn "+card1+" and "+card2);
	System.out.println("Do you wish to draw another card y/n");
	choice=kboard.nextLine();
		
			
		while (choice.equalsIgnoreCase("y")) //while loop will run until the player have won or exited
		{
			cardvalue = Cards.getRandomNumber();
			drawnCards[cardCount++] = cardvalue;
			System.out.println("You have drawn a "+cardvalue);
			total=Cards.calcTotal(total,cardvalue);
		if (Cards.busted(total)==true)
				{
				System.out.println("Busted! your cards totals are "+total+" which is over 21"); // display busted cards if over 21
			
				Cards.displayCards(drawnCards);
				break;
				}
		else
			System.out.println("Do you wish to draw another card y/n");
			choice=kboard.nextLine();
		}
		
	
		if (House.getResult(total,house)==true)
			{
			System.out.println("You have won with a total of "+total+". the house had a total of "+house);
			Cards.displayCards(drawnCards);
			}
		else
			{	
			System.out.println("You have lost with a total of "+total+", the house has a total of "+house);
			Cards.displayCards(drawnCards);
			}
		
		
    }//End of Method
}//End of Class


