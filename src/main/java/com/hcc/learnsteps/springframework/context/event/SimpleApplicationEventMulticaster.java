package com.hcc.learnsteps.springframework.context.event;

import com.hcc.learnsteps.springframework.beans.factory.BeanFactory;
import com.hcc.learnsteps.springframework.context.ApplicationEvent;
import com.hcc.learnsteps.springframework.context.ApplicationListener;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {
    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
