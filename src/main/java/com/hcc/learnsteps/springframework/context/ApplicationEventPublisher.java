package com.hcc.learnsteps.springframework.context;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
