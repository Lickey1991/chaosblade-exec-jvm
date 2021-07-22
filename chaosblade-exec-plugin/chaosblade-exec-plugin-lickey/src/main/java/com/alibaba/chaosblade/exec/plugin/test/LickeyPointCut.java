package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.aop.PointCut;
import com.alibaba.chaosblade.exec.common.aop.matcher.clazz.ClassMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.clazz.NameClassMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.method.MethodMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.method.NameMethodMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.method.OrMethodMatcher;


/**
 * @author yefei
 */
public class LickeyPointCut implements PointCut {

    @Override
    public ClassMatcher getClassMatcher() {
        NameClassMatcher nameClassMatcher = new NameClassMatcher("com.hellobike.openapi.admin.web.controller.TestController");
        return nameClassMatcher;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        OrMethodMatcher orMethodMatcher = new OrMethodMatcher();
        orMethodMatcher.or(new NameMethodMatcher("t"))
                .or(new NameMethodMatcher("matchSign"));

        return  orMethodMatcher;
    }
}