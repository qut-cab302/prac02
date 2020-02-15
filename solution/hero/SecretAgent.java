package hero;

/**
 * A secret agent has both a name and an alias, usually a number.
 * In addition, secret agents have a favourite gadget.
 */
public class SecretAgent implements Hero {
	
	private String toy;
	private String currentIdentity;
	private String otherIdentity;
	
	/**
	 * A secret agent has a civilian identity and a codename used
	 * when on a mission, as well as a number of gadgets.
	 * 
	 * @param trueName the secret agents's real name
	 * @param codeName the secret agent's identity within his or her organisation
	 * @param gadget the secret agent's favourite gadget
	 */
	public SecretAgent(String trueName, String codeName, String gadget) {
		currentIdentity = trueName;
		otherIdentity = codeName;
		toy = gadget;
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
	 * Identifies the secret agent's favourite gadget.
	 * 
	 * @return a description of the gadget
	 */
	public String getGadget() {
		return toy;
	}

}
