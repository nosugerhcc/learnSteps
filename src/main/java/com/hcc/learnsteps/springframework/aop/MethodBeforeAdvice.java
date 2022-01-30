package com.hcc.learnsteps.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
