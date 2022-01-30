package com.hcc.learnsteps.springframework.context.support;

import com.hcc.learnsteps.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hcc.learnsteps.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-12
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
