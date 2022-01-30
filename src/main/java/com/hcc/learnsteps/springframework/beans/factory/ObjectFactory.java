package com.hcc.learnsteps.springframework.beans.factory;

import com.hcc.learnsteps.springframework.beans.BeansException;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}
