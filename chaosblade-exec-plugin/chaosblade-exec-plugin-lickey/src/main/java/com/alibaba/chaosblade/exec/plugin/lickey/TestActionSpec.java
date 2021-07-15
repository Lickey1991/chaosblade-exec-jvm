/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosblade.exec.plugin.lickey;

import com.alibaba.chaosblade.exec.common.aop.PredicateResult;
import com.alibaba.chaosblade.exec.common.constant.CategoryConstants;
import com.alibaba.chaosblade.exec.common.model.FlagSpec;
import com.alibaba.chaosblade.exec.common.model.action.ActionModel;
import com.alibaba.chaosblade.exec.common.model.action.BaseActionSpec;
import com.alibaba.chaosblade.exec.common.model.action.delay.DefaultDelayExecutor;
import com.alibaba.chaosblade.exec.common.model.action.delay.TimeFlagSpec;
import com.alibaba.chaosblade.exec.common.model.action.delay.TimeOffsetFlagSpec;
import com.alibaba.chaosblade.exec.common.util.StringUtil;
import com.alibaba.chaosblade.exec.common.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Changjun Xiao
 */
public class TestActionSpec extends BaseActionSpec {


    public TestActionSpec() {
        super(new LickeyExecutor());
    }

    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String[] getAliases() {
        return new String[0];
    }

    @Override
    public String getShortDesc() {
        return "return test";
    }

    @Override
    public String getLongDesc() {
        if (StringUtils.isNotBlank(super.getLongDesc())) {
            return super.getLongDesc();
        }
        return "return test...";
    }

    @Override
    public List<FlagSpec> getActionFlags() {
        return null;
    }

    @Override
    public PredicateResult predicate(ActionModel actionModel) {

        return PredicateResult.success();
    }

    @Override
    public String[] getCategories() {
        return new String[] {"return test"};
    }
}
