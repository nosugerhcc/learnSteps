package com.hcc.learnsteps.springframework.aop.framework;

import com.hcc.learnsteps.springframework.aop.AdvisedSupport;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-30
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }

        return new JdkDynamicAopProxy(advisedSupport);
    }
}
