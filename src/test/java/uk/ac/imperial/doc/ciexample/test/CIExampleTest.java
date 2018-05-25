package uk.ac.imperial.doc.ciexample.test;

import junit.framework.TestCase;
import uk.ac.imperial.doc.ciexample.CIExampleBasic;

public class CIExampleTest extends TestCase {

	public void testAdd() {
		String[] args = new String[] {"add", "3", "4"};
		CIExampleBasic ci = new CIExampleBasic(args);
		int result = ci.runAction();
		assertEquals(result, 7);
	}

        public void testSub() {
                String[] args = new String[] {"sub", "12", "4"};
                CIExampleBasic ci = new CIExampleBasic(args);
                int result = ci.runAction();
                assertEquals(result, 8);
        }

}
