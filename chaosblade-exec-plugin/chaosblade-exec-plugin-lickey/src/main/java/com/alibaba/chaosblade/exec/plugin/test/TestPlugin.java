package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.aop.Enhancer;
import com.alibaba.chaosblade.exec.common.aop.Plugin;
import com.alibaba.chaosblade.exec.common.aop.PointCut;
import com.alibaba.chaosblade.exec.common.model.ModelSpec;

/**
 * @description: LickeyPlugin
 * @author: lvqi
 */
public class TestPlugin implements Plugin {
    @Override
    public String getName() {
        return "lickey1111";
    }

    @Override
    public ModelSpec getModelSpec() {
        return new LickeyModeSpec();
    }

    @Override
    public PointCut getPointCut() {
        return new LickeyPointCut();
    }

    @Override
    public Enhancer getEnhancer() {
        return new LickeyEnhancer();
    }
}
