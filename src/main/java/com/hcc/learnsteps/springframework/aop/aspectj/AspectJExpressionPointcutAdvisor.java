package com.hcc.learnsteps.springframework.aop.aspectj;

import org.aopalliance.aop.Advice;

import com.hcc.learnsteps.springframework.aop.Pointcut;
import com.hcc.learnsteps.springframework.aop.PointcutAdvisor;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;
    // 具体的拦截方法
    private Advice advice;

    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }


    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }
}
