package hero;

import java.io.PrintWriter;


/* 
 * This program briefly tests the implementation of your "SecretAgent" class.
 * The values displayed in square brackets are the expected answers.
 */
public class AgentTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Declare a "screen" object for displaying test results */
		PrintWriter screen = new PrintWriter(System.out, true);
		
		/* Create some secret agent objects */
		SecretAgent Bond = new SecretAgent("James Bond", "007", "Ejector seat");
		SecretAgent Smart = new SecretAgent("Maxwell Smart", "Agent 86", "Shoephone");
		SecretAgent Joe90 = new SecretAgent("Joe McClaine", "Joe 90", "Special glasses");
		
		/* Do a few simple test to ensure that the agent objects
		 * maintain their own data
		 */
		screen.println(" 1. To the rest of the world Max is known as a meek " +
				"greeting card salesman [Maxwell Smart]: " +
				Smart.currentIdentity());
		Smart.switchIdentity();
		screen.println(" 2. But when on a mission he's a fearless, if clumsy, " +
				"secret agent [Agent 86]: " + Smart.currentIdentity());
		screen.println(" 3. James Bond's favourite gadget was supplied by Q branch " +
				"[Ejector seat]: " + Bond.getGadget());
		screen.println(" 4. But Joe 90's main weapon was made by his (adopted) " +
				"father [Special glasses]: " + Joe90.getGadget());
			
	}

}
