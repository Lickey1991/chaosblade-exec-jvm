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

package com.alibaba.chaosblade.exec.plugin.test;

import com.alibaba.chaosblade.exec.common.aop.PredicateResult;
import com.alibaba.chaosblade.exec.common.model.matcher.BasePredicateMatcherSpec;
import com.alibaba.chaosblade.exec.common.model.matcher.MatcherModel;

/**
 * @author Changjun Xiao
 */
public class ClassFlagSpec extends BasePredicateMatcherSpec {

    @Override
    public String getName() {
        return "class";
    }

    @Override
    public String getDesc() {
        return "class name";
    }

    @Override
    public boolean noArgs() {
        return false;
    }

    @Override
    public boolean required() {
        return true;
    }

    @Override
    public PredicateResult predicate(MatcherModel matcherModel) {
        String value = matcherModel.get(getName());
        if (value == null) {
            if (required()) {
                return PredicateResult.fail("less necessary " + getName() + " value");
            }
        }
        return PredicateResult.success();
    }
}
