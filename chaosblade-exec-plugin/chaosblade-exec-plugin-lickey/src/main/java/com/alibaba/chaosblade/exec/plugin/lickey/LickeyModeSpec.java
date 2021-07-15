package com.alibaba.chaosblade.exec.plugin.lickey;

import com.alibaba.chaosblade.exec.common.model.FrameworkModelSpec;
import com.alibaba.chaosblade.exec.common.model.action.ActionSpec;
import com.alibaba.chaosblade.exec.common.model.action.delay.DelayActionSpec;
import com.alibaba.chaosblade.exec.common.model.action.exception.ThrowCustomExceptionActionSpec;
import com.alibaba.chaosblade.exec.common.model.matcher.MatcherSpec;
import com.alibaba.chaosblade.exec.common.plugin.ClassNameMatcherSpec;
import com.alibaba.chaosblade.exec.common.plugin.MethodAfterMatcherSpec;
import com.alibaba.chaosblade.exec.common.plugin.MethodNameMatcherSpec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yefei
 */
public class LickeyModeSpec extends FrameworkModelSpec {

    public LickeyModeSpec() {
        addUpdateActionSpec();
        addActionExample();
    }
    private void addUpdateActionSpec() {
        TestActionSpec actionSpec = new TestActionSpec();
        actionSpec.addMatcherDesc(new ClassNameMatcherSpec());
        addActionSpec(actionSpec);
    }

    private void addActionExample() {
        List<ActionSpec> actions = getActions();
        for (ActionSpec action : actions) {
            if (action instanceof TestActionSpec) {
                action.setLongDesc("test experiment");
                action.setExample("# test");
            }
        }
    }

    @Override
    protected List<MatcherSpec> createNewMatcherSpecs() {
        ArrayList<MatcherSpec> matcherSpecs = new ArrayList<MatcherSpec>();
        matcherSpecs.add(new ClassNameMatcherSpec());

        return matcherSpecs;
    }

    @Override
    public String getTarget() {
        return "lickey";
    }

    @Override
    public String getShortDesc() {
        return "mysql experiment";
    }

    @Override
    public String getLongDesc() {
        return "Mysql experiment contains delay and exception by table name and so on.";
    }

}