package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.aop.BeforeEnhancer;
import com.alibaba.chaosblade.exec.common.aop.EnhancerModel;
import com.alibaba.chaosblade.exec.common.model.matcher.MatcherModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;


/**
 * @author yefei
 */
public class LickeyEnhancer extends BeforeEnhancer {

    private static final Logger logger = LoggerFactory.getLogger(LickeyEnhancer.class);

    @Override
    public EnhancerModel doBeforeAdvice(ClassLoader classLoader,
                                        String className,
                                        Object object,
                                        Method method,
                                        Object[] methodArguments)  {

        MatcherModel matcherModel = new MatcherModel();
        matcherModel.add("class", className);
        matcherModel.add("method", method.getName());


        EnhancerModel enhancerModel =  new EnhancerModel(classLoader, matcherModel);

        enhancerModel.addCustomMatcher("method", method.getName(), new TestMethodCustomMatcher());
//        enhancerModel.addCustomMatcher("class", className, new TestMethodCustomMatcher());
        return enhancerModel;
    }
}