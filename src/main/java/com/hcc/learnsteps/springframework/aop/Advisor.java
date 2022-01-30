package com.hcc.learnsteps.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public interface Advisor {

    Advice getAdvice();


}
