package hero;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * A superhuman is born with "powers and abilities far beyond those
 * of mortal men" (e.g., the Amazonian Wonder Woman) but usually adopts
 * a mild-mannered secret identity (e.g., "Diana Prince").  However,
 * under certain circumstances a superhuman may lose some of their
 * powers (e.g., when Superman is exposed to gold kryptonite), may later
 * regain lost ones, or may acquire entirely new powers.
 */
public class SuperHuman extends SuperHero {

	/* Represent the superhero's powers as a set, to eliminate duplicates
	 * and because the powers' order is unimportant
	 */
	private Set<SuperPower> currentPowers;
	private int sumOfPowers = 0;
	
	/**
	 * When born a superhuman has a real (super) name and later adopts a
	 * secret (non-super) identity.  A superhuman also has a collection of
	 * innate superpowers at birth.  If the given collection of superpowers
	 * contains duplicates the unnecessary ones are ignored.
	 * 
	 * @param realName the superhuman's true identity
	 * @param secretIdentity the superhuman's adopted identity
	 * @param innatePowers the superhuman's original superpowers
	 */
	public SuperHuman(String realName, String secretIdentity,
			SuperPower[] innatePowers) {
		super(realName, secretIdentity);
		currentPowers = new HashSet<SuperPower>(Arrays.asList(innatePowers));
		for (SuperPower power: currentPowers) {
			sumOfPowers += power.getValue();
		}
	}

	@Override
	public int totalPower() {
		return sumOfPowers;
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return currentPowers.contains(queriedPower);
	}
	
	/**
	 * Adds the given collection of new superpowers to those
	 * already possessed.  No action is taken for powers already
	 * owned by the superhero, i.e., a superhero can't have the
	 * same superpower twice.
	 * 
	 * @param newPowers the new powers to be added, if not already
	 * owned
	 */
	public void acquirePowers(SuperPower[] newPowers) {
		for (SuperPower newPower: newPowers) {
			if (currentPowers.add(newPower)) {
				sumOfPowers += newPower.getValue();
			}
		}
	}
	
	/**
	 * Removes the given collection of superpowers from those possessed
	 * by the superhero.  No action is taken for powers not currently
	 * owned by the superhero, i.e., you can't take away a power that
	 * the hero doesn't have.
	 * 
	 * @param oldPowers the existing powers to be retracted, if currently
	 * possessed
	 */
	public void losePowers(SuperPower[] oldPowers) {
		for (SuperPower oldPower: oldPowers) {
			if (currentPowers.remove(oldPower)) {
				sumOfPowers -= oldPower.getValue();
			}
		}
	}
	
}
