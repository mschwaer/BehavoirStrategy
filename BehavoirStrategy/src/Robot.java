/***
 * 
 * @author http://www.oodesign.com/strategy-pattern.html
 *
 */
public class Robot {
	IBehaviour behaviour;
	String name;
/***
 * 
 * @param name
 */
	public Robot(String name)
	{
		this.name = name;
	}
	/***
	 * 
	 * @param behaviour
	 */
	public void setBehaviour(IBehaviour behaviour)
	{
		this.behaviour = behaviour;
	}
	/***
	 * 
	 * @return
	 */
	public IBehaviour getBehaviour()
	{
		return behaviour;
	}
	/***
	 * 
	 */
	public void move()
	{
		System.out.println(this.name + ": Based on current position" +
					 "the behaviour object decide the next move:");
		int command = behaviour.moveCommand();
		// ... send the command to mechanisms
		System.out.println("\tThe result returned by behaviour object " +
					"is sent to the movement mechanisms " + 
					" for the robot '"  + this.name + "'");
	}
	/**
	 * Hole den Namen des Roboters
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setze den Namen des Roboters
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}

