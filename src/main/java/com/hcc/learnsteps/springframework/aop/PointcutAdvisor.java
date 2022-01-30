package com.hcc.learnsteps.springframework.aop;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
