
package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

    //TC1
    public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        assertTrue(s1.isEmpty());
        assertEquals(0, s1.getSize());
    }

    //TC2
    public void testPushElmToTop() {
        try {
            Stack s1 = new Stack();
            assertTrue(s1.isEmpty());
            s1.push("element");
            assertFalse(s1.isEmpty());
            assertEquals(1, s1.getSize());
            assertEquals("element", s1.getTop());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    //TC3
    public void testPushDifferentElmTypeToStack() {
        try {
            Stack s1 = new Stack();
            s1.push(10);
            s1.push(true);
            // Add assertions to verify the pushed elements
            assertEquals(true, s1.pop());
            assertEquals(10, s1.pop());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    //TC4
    public void testLastInFirstOut() {
        try {
            Stack s1 = new Stack();
            s1.push(10);
            s1.push(20);

            assertEquals(20, s1.pop());
            assertEquals(10, s1.pop());
            assertTrue(s1.isEmpty());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    //TC5
    public void testPushtoFullStack() {
        try {
            Stack s1 = new Stack(3);
            s1.push(10);
            s1.push(20);
            s1.push(30);
            s1.push(40); // This should throw an exception as the stack is full
            fail("Expected an exception but didn't get one.");
        } catch (Exception e) {
            assertEquals("Error: the stack is full.", e.getMessage());
        }
    }
}

