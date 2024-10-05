package org.launchCode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

 class Test {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}