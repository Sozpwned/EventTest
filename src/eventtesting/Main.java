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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static EventHandler mainHandler = new EventHandler();
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestEvent event = new TestEvent();
        NewEvent sEvent = new NewEvent();
        mainHandler.addEvent(event);
        mainHandler.addEvent(sEvent);
        TestObject obj = new TestObject();
  
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 6) {
                event.triggerEvent();
            }
            mainHandler.onUpdate();
            obj.onUpdate();

        }
    }

    
}
