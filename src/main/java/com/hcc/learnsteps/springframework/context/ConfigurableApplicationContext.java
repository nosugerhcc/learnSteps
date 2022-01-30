package com.hcc.learnsteps.springframework.context;

import com.hcc.learnsteps.springframework.beans.BeansException;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-12
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
