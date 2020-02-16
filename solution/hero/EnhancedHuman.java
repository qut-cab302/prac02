package hero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An "enhanced" human is born as a mere mortal (e.g., Billy Batson) but
 * later gains the ability to turn into a superhero (e.g., Captain Marvel)
 * through some magical or science fiction plot device (e.g., by saying the
 * name of the wizard "Shazam").  Therefore, when an enhanced human switches
 * into their secret (super) identity they also acquire a whole collection of
 * superpowers, and lose them again when changing back to their real
 * (non-super) identity.
 */
public class EnhancedHuman extends SuperHero {

	/* Represent the superhero's powers as a set, to eliminate duplicates
	 * and because the power's order is unimportant
	 */
	private Set<SuperPower> allPowers;
	private int sumOfPowers = 0;
	private boolean enhanced;
	
	/**
	 * A superhero of the "enhanced human" variety begins life with no
	 * superpowers and a mortal identity, but also has an "enhanced"
	 * (super) identity, in which he/she acquires several superpowers.
	 * 
	 * @param normalIdentity the superhero's initial, mortal identity
	 * @param enhancedIdentity the superhero's "enhanced" identity,
	 * when transformed
	 * @param acquiredPowers the superpowers the hero acquires when in
	 * his/her "enhanced" identity
	 */
	public EnhancedHuman(String normalIdentity, String enhancedIdentity, 
			SuperPower[] acquiredPowers) {
		super(normalIdentity, enhancedIdentity);
		allPowers = new HashSet<SuperPower>(Arrays.asList(acquiredPowers));
		for (SuperPower power: acquiredPowers) {
			sumOfPowers += power.getValue();
		};
		enhanced = false;	
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return enhanced && allPowers.contains(queriedPower);
	}

	@Override
	public int totalPower() {
		return (enhanced ? sumOfPowers : 0);
	}

	/**
	 * Switches the hero's current identity to their alter ego.  When a
	 * hero changes to their "super" identity they gain all of their
	 * powers.  When they switch back to their normal identity they lose
	 * them again.
	 */
	@Override
	public void switchIdentity() {
		super.switchIdentity();
		enhanced = !enhanced;
	}
}
