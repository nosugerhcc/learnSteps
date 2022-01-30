package com.hcc.learnsteps.springframework.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2022-01-11
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
