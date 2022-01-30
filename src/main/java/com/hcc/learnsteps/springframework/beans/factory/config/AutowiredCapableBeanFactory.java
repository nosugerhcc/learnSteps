package com.hcc.learnsteps.springframework.beans.factory.config;

import com.hcc.learnsteps.springframework.beans.BeansException;
import com.hcc.learnsteps.springframework.beans.factory.BeanFactory;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public interface AutowiredCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
