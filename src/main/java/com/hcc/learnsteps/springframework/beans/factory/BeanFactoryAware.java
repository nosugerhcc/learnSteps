package com.hcc.learnsteps.springframework.beans.factory;

import com.hcc.learnsteps.springframework.beans.BeansException;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-28
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
