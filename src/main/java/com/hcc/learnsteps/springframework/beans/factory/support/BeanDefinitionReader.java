package com.hcc.learnsteps.springframework.beans.factory.support;

import com.hcc.learnsteps.springframework.beans.BeansException;
import com.hcc.learnsteps.springframework.io.Resource;
import com.hcc.learnsteps.springframework.io.ResourceLoader;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
