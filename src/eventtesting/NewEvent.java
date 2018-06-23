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
public class NewEvent implements GameEvent {
    private boolean triggered;
    private String ident;
    
    public NewEvent() {
        triggered = false;
        ident = "";
    }
    @Override
    public void triggerEvent() {
        triggered = true;
    }

    @Override
    public boolean isTriggered() {
        return(triggered);
    }

    @Override
    public void reset() {
        triggered = false;
    }

    @Override
    public Events getType() {
        return (Events.NEWEVENT);
    }
    
}
