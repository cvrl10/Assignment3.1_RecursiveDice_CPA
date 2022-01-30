
/**
 * 
 * @author Carl
 * @version 1.0
 * Assignment 3.1
 */
public final class RecDieRollerDriver 
{
	/**
	 * main method where program execution happen
	 * @param args
	 */
	public static void main(String[] args)
	{
		RecDieRoller dice = new RecDieRoller();
		dice.roll();
		
		int[] rolls = new int[1000];
		for (int i = 0; i < rolls.length; i++)
			rolls[i] = dice.roll();
		System.out.println("The average number of die rolls it takes to get a 2 after 1000 rolls is: "+avg(rolls));
	}//end main
	
	/**
	 * @param array, the array of int to average
	 * @return the average of the numbers in an array of int
	 */
	private static double avg(int[] array)
	{
		double total = 0;
		for (int i = 0; i < array.length; i++)
			total += array[i];
		return total/array.length;
	}//end avg
}//end class
