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
public class EventListener {
    private boolean triggered = false;
    private Events listeningFor;
    
    public EventListener(Events listenFor) {
        listeningFor = listenFor;
    }
    public void setTriggered(Boolean b) {
        triggered = b;
    }
    public boolean isTriggered() {
        return(triggered);
    }
    public boolean isListeningFor(Events event) {
       if (listeningFor == event) {
           return(true);
       } else
           return(false);
    }
}