/*
 * Date: 16/09/2020
 * Student Number: 11001826
 * Student Name: Connor Macleod 
 * Version:  1
 */

package pontoonweek2challenge;



public class House {
	
	

	public static int houseTotal(int x) //returns the total of house cards
			{
			int house=0;
			while (house < x)
				house = Cards.calcTotal(Cards.getRandomNumber(),Cards.getRandomNumber());	
			return(house);
			}

	
	
    public static boolean getResult(int total,int house) //returns the result of user total versus house
				{
				if (total>house && total<=21)
					return(true);
				else
					return(false);
				}


}// End of Class

