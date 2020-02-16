package hero;


/**
 * A superhero is a hero (with two identities) but may also have
 * superpowers.
 */
public abstract class SuperHero implements Hero {

	private String currentIdentity;
	private String otherIdentity;
	
	/**
	 * When first born a superhero has a particular identity, but has
	 * the ability to change identities.
	 * 
	 * @param trueIdentity the superhero's identity at birth
	 * @param alterEgo the superhero's assumed persona
	 */
	public SuperHero(String trueIdentity, String alterEgo) {
		currentIdentity = trueIdentity;
		otherIdentity = alterEgo;
	}
	
	public String currentIdentity() {
		return currentIdentity;
	}
	
	public void switchIdentity() {
		String temp;
		temp = currentIdentity;
		currentIdentity = otherIdentity;
		otherIdentity = temp;
	}
	
	/**
	 * Tests to see whether or not the superhero currently has the
	 * queried superpower.
	 * 
	 * @param queriedPower the superpower in question
	 * @return true iff the superhero currently has this power
	 */
	public abstract boolean hasPower(SuperPower queriedPower);
	
	/**
	 * Returns the superhero's current "total power" which is the
	 * sum of the numerical values associated with all of his/her
	 * currently-held powers.
	 * 
	 * @return the numerical sum of the superhero's current powers
	 */
	public abstract int totalPower();
	
}
