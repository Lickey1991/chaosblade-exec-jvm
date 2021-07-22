package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.model.FrameworkModelSpec;
import com.alibaba.chaosblade.exec.common.model.matcher.MatcherSpec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yefei
 */
public class LickeyModeSpec extends FrameworkModelSpec {
    private final  static ClassFlagSpec classFlagSpec = new ClassFlagSpec();
    private  final static MethodFlagSpec methodFlagSpec = new MethodFlagSpec();

    public LickeyModeSpec() {
        addTestActionSpec();
    }

    private void addTestActionSpec() {
        TestActionSpec actionSpec = new TestActionSpec();
        actionSpec.addMatcherDesc(classFlagSpec);
        actionSpec.addMatcherDesc(methodFlagSpec);
        addActionSpec(actionSpec);
    }


    @Override
    protected List<MatcherSpec> createNewMatcherSpecs() {
        ArrayList<MatcherSpec> matcherSpecs = new ArrayList<MatcherSpec>();

        matcherSpecs.add(classFlagSpec);
        matcherSpecs.add(methodFlagSpec);
        return matcherSpecs;
    }

    @Override
    public String getTarget() {
        return "lickey";
    }

    @Override
    public String getShortDesc() {
        return "lickey experiment";
    }

    @Override
    public String getLongDesc() {
        return "lickey experiment return value.";
    }


}