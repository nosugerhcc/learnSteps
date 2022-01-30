package com.hcc.learnsteps.springframework.beans.factory.config;

import com.hcc.learnsteps.springframework.beans.BeansException;
import com.hcc.learnsteps.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-12
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
