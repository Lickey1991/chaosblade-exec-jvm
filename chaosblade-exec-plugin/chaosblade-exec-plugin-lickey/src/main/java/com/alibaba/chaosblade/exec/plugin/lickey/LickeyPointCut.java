package com.alibaba.chaosblade.exec.plugin.lickey;

import com.alibaba.chaosblade.exec.common.aop.PointCut;
import com.alibaba.chaosblade.exec.common.aop.matcher.clazz.ClassMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.clazz.NameClassMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.method.MethodMatcher;
import com.alibaba.chaosblade.exec.common.aop.matcher.method.NameMethodMatcher;


/**
 * @author yefei
 */
public class LickeyPointCut implements PointCut {

    @Override
    public ClassMatcher getClassMatcher() {
        NameClassMatcher nameClassMatcher = new NameClassMatcher("com.hellobike.openapi.admin.application.service.openapi");
        return nameClassMatcher;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        NameMethodMatcher nameMethodMatcher = new NameMethodMatcher("fetchApiDetail");
        return nameMethodMatcher;
    }
}