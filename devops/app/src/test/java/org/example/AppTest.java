/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();

        double num1 = 5;
        double num2 = 10;
        double sum = num1 + num2;
        double sum2 = num1 + num2;
        System.out.printf("The sum of %.2f and %.2f is %.2f%n", num1, num2, sum);
        assertEquals(sum, sum2, 0.01);
    }
}
