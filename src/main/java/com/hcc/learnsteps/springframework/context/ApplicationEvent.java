package com.hcc.learnsteps.springframework.context;

import java.util.EventObject;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
