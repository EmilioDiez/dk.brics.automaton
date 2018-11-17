package nitoku.com;

import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

import org.junit.Assert;
import org.junit.Test;


public class TestSimple {

	@Test
	public void simpleTest() {
		// TODO Auto-generated method stub

		RegExp r = new RegExp("ab(c|d)*");
		Automaton a = r.toAutomaton();
		String s = "abcccdc";
		Assert.assertTrue(a.run(s));
		// prints: true
		//System.out.println("Match: " + a.run(s)); 
		
	}

}
