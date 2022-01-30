package com.hcc.learnsteps.springframework.beans.factory.support;

import com.hcc.learnsteps.springframework.io.DefaultResourceLoader;
import com.hcc.learnsteps.springframework.io.ResourceLoader;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
