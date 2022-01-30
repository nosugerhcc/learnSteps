package com.hcc.learnsteps.springframework.context.event;

import com.hcc.learnsteps.springframework.context.ApplicationEvent;
import com.hcc.learnsteps.springframework.context.ApplicationListener;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);

}
