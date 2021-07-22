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

import com.alibaba.chaosblade.exec.common.aop.EnhancerModel;
import com.alibaba.chaosblade.exec.common.exception.InterruptProcessException;
import com.alibaba.chaosblade.exec.common.model.action.ActionExecutor;
import com.alibaba.chaosblade.exec.common.model.matcher.MatcherModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Changjun Xiao
 */
public class LickeyExecutor implements ActionExecutor {

    public static final String NULL = "null";

    public LickeyExecutor() {

    }


    @Override
    public void run(EnhancerModel enhancerModel) throws Exception {
        // get return value from model action
        MatcherModel matcherModel = enhancerModel.getMatcherModel();
        if (matcherModel.get("method").toString().equals("t")) {
            Object returnValue = "test";
            InterruptProcessException.throwReturnImmediately(returnValue);
        }
        if (matcherModel.get("method").toString().contains("matchSign")) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success",false);
            map.put("code",11111);
            map.put("msg","hahaha");
            InterruptProcessException.throwReturnImmediately(map);
        }
    }
}
