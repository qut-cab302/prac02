package hero;


/**
 * Some mere mortals are nonetheless "super" heroes thanks to their
 * fearlessness and training.  (Batman is an obvious example.)
 * These superheroes never have any superpowers.
 */
public class Human extends SuperHero {

	/**
	 * When born a human superhero has a "plain" identity (e.g., "Bruce
	 * Wayne"), but later in life adopts a secret identity for use when
	 * fighting crime (e.g., "Batman").
	 * 
	 * @param realName the superhero's birth identity
	 * @param secretIdentity the superhero's assumed identity
	 */
	public Human(String realName, String secretIdentity) {
		super(realName, secretIdentity);
	}

	/**
	 * Returns the sum of a human's superpowers (which is always zero).
	 * 
	 * @return zero
	 */
	@Override
	public int totalPower() {
		return 0;		
	}

	/**
	 * Returns the answer to whether or not a human has a
	 * particular superpower (which is always no).
	 * 
	 * @return false
	 */
	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return false;
	}

}
