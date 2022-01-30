package com.hcc.learnsteps.springframework.context.event;

import com.hcc.learnsteps.springframework.context.ApplicationContext;
import com.hcc.learnsteps.springframework.context.ApplicationEvent;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
