/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventtesting;

/**
 *
 * @author Shark
 */
public class TestObject {
    private EventListener testEventListener;
    private EventListener nEL;
    public TestObject() {
        testEventListener = Main.mainHandler.addListener(Events.TESTEVENT);
        nEL = Main.mainHandler.addListener(Events.NEWEVENT);
    }
    public void onUpdate() {
        if (testEventListener.isTriggered()) {
            System.out.println("Hello");
        }
        if (nEL.isTriggered()) {
            System.out.println("New Event Here");
        }
    }
}
