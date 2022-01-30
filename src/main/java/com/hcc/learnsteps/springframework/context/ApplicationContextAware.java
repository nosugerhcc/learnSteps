package com.hcc.learnsteps.springframework.context;

import com.hcc.learnsteps.springframework.beans.BeansException;
import com.hcc.learnsteps.springframework.beans.factory.Aware;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-28
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
