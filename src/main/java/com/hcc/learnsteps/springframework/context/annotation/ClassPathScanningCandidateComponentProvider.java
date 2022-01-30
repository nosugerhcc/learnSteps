package com.hcc.learnsteps.springframework.context.annotation;

import java.util.LinkedHashSet;
import java.util.Set;

import com.hcc.learnsteps.springframework.beans.factory.config.BeanDefinition;
import com.hcc.learnsteps.springframework.stereotype.Component;

import cn.hutool.core.util.ClassUtil;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }

}
