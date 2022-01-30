package com.hcc.learnsteps.springframework.beans.factory.config;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
