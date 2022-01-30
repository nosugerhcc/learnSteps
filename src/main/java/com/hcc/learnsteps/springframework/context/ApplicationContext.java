package com.hcc.learnsteps.springframework.context;

import com.hcc.learnsteps.springframework.beans.factory.HierarchicalBeanFactory;
import com.hcc.learnsteps.springframework.beans.factory.ListableBeanFactory;
import com.hcc.learnsteps.springframework.io.ResourceLoader;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-12
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
