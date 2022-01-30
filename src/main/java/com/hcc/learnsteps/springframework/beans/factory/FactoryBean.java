package com.hcc.learnsteps.springframework.beans.factory;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-28
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
