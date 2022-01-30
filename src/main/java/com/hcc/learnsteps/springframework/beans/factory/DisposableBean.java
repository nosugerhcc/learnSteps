package com.hcc.learnsteps.springframework.beans.factory;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-27
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
