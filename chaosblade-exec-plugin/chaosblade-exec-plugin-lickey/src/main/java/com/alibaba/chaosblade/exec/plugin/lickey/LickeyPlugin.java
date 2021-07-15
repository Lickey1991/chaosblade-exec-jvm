package com.alibaba.chaosblade.exec.plugin.lickey;

import com.alibaba.chaosblade.exec.common.aop.Enhancer;
import com.alibaba.chaosblade.exec.common.aop.Plugin;
import com.alibaba.chaosblade.exec.common.aop.PointCut;
import com.alibaba.chaosblade.exec.common.model.ModelSpec;
import com.alibaba.chaosblade.exec.common.plugin.MethodEnhancer;

/**
 * @description: LickeyPlugin
 * @author: lvqi
 */
public class LickeyPlugin implements Plugin {
    @Override
    public String getName() {
        return "lickey plugin";
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
        return new MethodEnhancer();
    }
}
