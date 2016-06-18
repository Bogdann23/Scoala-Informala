/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

public class CounterDouble2 {
    //var. comuna ce va fi accesata de mai multe threaduri
    private volatile double c;
    /**
     * Increments the counter
     */
    synchronized public void increment() {
        c++;
    }
    /**
     * Decrements the counter
     */
    synchronized public void decrement() {
        c--;
    }
    /**
     * @return value of counter
     */
    public double value() {
        return c;
    }    
}
