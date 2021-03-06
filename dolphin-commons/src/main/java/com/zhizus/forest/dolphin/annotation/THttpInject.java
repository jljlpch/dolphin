package com.zhizus.forest.dolphin.annotation;

import java.lang.annotation.*;

/**
 * Created by dempezheng on 2017/8/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface THttpInject {

    String value() default "";

    String serviceName() default "";

    /**
     * 多个用逗号分隔
     *
     * @return
     */
    String backupServers() default "";

    String path() default "/";
}
