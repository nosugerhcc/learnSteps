package com.hcc.learnsteps.springframework.context;

import java.util.EventListener;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-29
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
