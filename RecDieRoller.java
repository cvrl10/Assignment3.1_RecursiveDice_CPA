
/**
 * 
 * @author Carl
 * @version 1.0
 * Assignment 3.1
 */
public final class RecDieRoller
{
	private int count;
	/**
	 * Instantiate the RecDieRoller object
	 */
	public RecDieRoller()
	{
		reset();
	}//end empty-argument constructor
	
	/**
	 * creates a random integer representing the face of a die.
	 * the method call itself until a 2 shows up and records the number of rolls.
	 */
    public int roll()
    {
    	count++;
        int i = (int)(Math.random()*6+1);
        System.out.println("You've rolled: "+i);
        if (i != 2)
            return roll();
        else
        {
        	int rolls = count;
        	reset();
        	return rolls;
        }  	
    }//end roll
    
    /**
     * sets count to 0
     */
    private void reset()
    {
    	count = 0;
    }//end reset
}//end class