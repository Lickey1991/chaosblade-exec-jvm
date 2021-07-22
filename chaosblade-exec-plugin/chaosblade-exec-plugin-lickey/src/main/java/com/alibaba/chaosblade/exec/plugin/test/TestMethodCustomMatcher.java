package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.aop.CustomMatcher;

/**
 * @description: TestMethodCustomMatcher
 * @author: lvqi
 */
public class TestMethodCustomMatcher implements CustomMatcher {
    @Override
    public boolean match(String commandValue, Object originValue) {
        return commandValue.equals(originValue.toString());
    }

    @Override
    public boolean regexMatch(String commandValue, Object originValue) {
        return commandValue.contains(originValue.toString());
    }
}
