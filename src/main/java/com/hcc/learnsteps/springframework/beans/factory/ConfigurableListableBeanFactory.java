package com.hcc.learnsteps.springframework.beans.factory;

import com.hcc.learnsteps.springframework.beans.BeansException;
import com.hcc.learnsteps.springframework.beans.factory.config.AutowiredCapableBeanFactory;
import com.hcc.learnsteps.springframework.beans.factory.config.BeanDefinition;
import com.hcc.learnsteps.springframework.beans.factory.config.BeanPostProcessor;
import com.hcc.learnsteps.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, ConfigurableBeanFactory,
        AutowiredCapableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
