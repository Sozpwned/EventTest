/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventtesting;

import java.util.ArrayList;

/**
 *
 * @author Shark
 */
public class EventHandler {
    ArrayList<GameEvent> events = new ArrayList();
    ArrayList<EventListener> listeners = new ArrayList();
    
    public EventHandler() {
        
    }

    public void onUpdate() {
        //Reset Listeners//
        for (EventListener listener : listeners) {
            listener.setTriggered(false);
        }
        //Notify interested listeners to events//
        for (GameEvent event : events) {
            if (event.isTriggered()) {
                for (EventListener listener : listeners) {
                    if (listener.isListeningFor(event.getType())) {
                        listener.setTriggered(true);
                    }
                }
            }
            event.reset();
        }
    }

    public void addEvent(GameEvent event) {
        events.add(event);
    }

    public EventListener addListener(Events listenFor) {
        EventListener listener = new EventListener(listenFor);
        listeners.add(listener);

        return (listener);
    }
}
