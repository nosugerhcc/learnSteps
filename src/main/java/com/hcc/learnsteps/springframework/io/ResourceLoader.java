package com.hcc.learnsteps.springframework.io;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
