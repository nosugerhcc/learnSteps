package com.hcc.learnsteps.springframework.context.event;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }

}

