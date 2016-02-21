/***
 * 
 * @author http://www.oodesign.com/strategy-pattern.html
 *
 */
public class NormalBehaviour implements IBehaviour{
	public int moveCommand()
	{
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}
}